package com.rpg.pessoas.RpgPlacePessoas.adapters.database.adap;


import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.UserEntity;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.UserMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAdapter implements UserMapper {

    @Override
    public UserModel toModel(UserEntity entity) {
        return UserModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .build();
    }

    @Override
    public UserEntity toEntity(UserModel model) {
        return UserEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .email(model.getEmail())
                .password(model.getPassword())
                .build();
    }

    @Override
    public List<UserModel> toModelList(List<UserEntity> list) {
        return list.stream().map(this::toModel).toList();
    }
}
