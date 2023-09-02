package com.rpg.pessoas.RpgPlacePessoas.application.core.usecase;

import com.rpg.pessoas.RpgPlacePessoas.application.core.exception.CoreException;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;
import com.rpg.pessoas.RpgPlacePessoas.port.AddressPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AddressUseCase {

    @Autowired
    private AddressPort addressPort;

    public AddressModel findAddress(Long id) {
        var response = addressPort.findById(id);

        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }

        return response;
    }

    public List<AddressModel> findAll() {
        return addressPort.findAll();
    }

    public AddressModel addAddress(AddressModel model) {
        validarCampos(model);

        return addressPort.save(model);
    }

    public AddressModel updateUser(Long id, AddressModel model) {
        if (Objects.isNull(id)) {
            throw new CoreException("Erro");
        }

        validarCampos(model);

        var user = findAddress(id);
        var response = Objects.equals(user.getId(), model.getId()) ? addressPort.save(model) : null;
        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }
        return response;
    }

    private void validarCampos(AddressModel model) {
        if (Objects.isNull(model)) {
            throw new CoreException("Erro");
        }
    }
}
