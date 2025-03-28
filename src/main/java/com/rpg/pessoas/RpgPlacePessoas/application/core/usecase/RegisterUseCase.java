package com.rpg.pessoas.RpgPlacePessoas.application.core.usecase;

import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import com.rpg.pessoas.RpgPlacePessoas.port.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterUseCase {

    @Autowired
    private UserPort userPort;
    @Autowired
    private AddressUseCase addressUseCase;

    public UserModel addUser(UserModel model) {
        return userPort.save(model);
    }
}
