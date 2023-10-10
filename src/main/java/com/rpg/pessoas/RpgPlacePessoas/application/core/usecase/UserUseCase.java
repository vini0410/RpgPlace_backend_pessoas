package com.rpg.pessoas.RpgPlacePessoas.application.core.usecase;

import com.rpg.pessoas.RpgPlacePessoas.application.core.exception.CoreException;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import com.rpg.pessoas.RpgPlacePessoas.port.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserUseCase {

    @Autowired
    private UserPort userPort;
    @Autowired
    private AddressUseCase addressUseCase;

    public UserModel findUser(Long id) {
        var response = userPort.findById(id);

        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }

        return response;
    }

    public List<UserModel> findAll() {
        return userPort.findAll();
    }

    public UserModel addUser(UserModel model) {
        validarCampos(model);

//        var address = addressUseCase.addAddress(model.getAddress());

//        model.setAddress(address);

        return userPort.save(model);
    }

    public UserModel updateUser(Long id, UserModel model) {
        if (Objects.isNull(id)) {
            throw new CoreException("Erro");
        }

        validarCampos(model);

        var user = findUser(id);
        var response = Objects.equals(user.getId(), model.getId()) ? userPort.save(model) : null;
        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }
        return response;
    }

    private void validarCampos(UserModel model) {
        if (Objects.isNull(model)) {
            throw new CoreException("Erro");
        }
    }
}
