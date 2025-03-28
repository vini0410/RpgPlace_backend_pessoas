package com.rpg.pessoas.RpgPlacePessoas.application.core.usecase;

import com.rpg.pessoas.RpgPlacePessoas.application.core.exception.CoreException;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import com.rpg.pessoas.RpgPlacePessoas.port.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class LoginUseCase {

    @Autowired
    private UserPort userPort;
    @Autowired
    private AddressUseCase addressUseCase;

    public UserModel loginUser(UserModel model) {
        var user = userPort.findByEmail(model.getEmail());

        var valido = validaUser(model, user);

        if (!valido) {
            throw new CoreException("Usuario ou senha invalidos");
        }

        return user;
    }

    public UserModel getByEmail(String email) {
        var user = userPort.findByEmail(email);
        System.out.println(user);

        return (Objects.isNull(user)) ? null : user;
    }

    private boolean validaUser(UserModel model, UserModel user) {

        var emailValido = Objects.equals(model.getEmail(), user.getEmail());
        var senhaValida = Objects.equals(model.getPassword(), user.getPassword());

        return emailValido && senhaValida;
    }
}
