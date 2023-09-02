package com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper;

import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.UserEntity;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;

import java.util.List;

public interface UserMapper {

    UserModel toModel (UserEntity entity);

    List<UserModel> toModelList (List<UserEntity> list);

    UserEntity toEntity (UserModel model);
}
