package com.rpg.pessoas.RpgPlacePessoas.adapters.database.adap;


import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.UserEntity;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.UserMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserAdapter implements UserMapper {

    @Override
    public UserModel toModel(UserEntity entity) {
        return UserModel.builder().build();
    }

    @Override
    public List<UserModel> toModelList(List<UserEntity> list) {
        return new ArrayList<>();
    }

    @Override
    public UserEntity toEntity(UserModel model) {
        return UserEntity.builder().build();
    }
}
