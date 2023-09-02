package com.rpg.pessoas.RpgPlacePessoas.port;

import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;

import java.util.List;

public interface UserPort {

    UserModel findById(Long id);

    List<UserModel> findAll();

    UserModel save(UserModel model);
}
