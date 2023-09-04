package com.rpg.pessoas.RpgPlacePessoas.adapters.database.impl;


import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.UserEntity;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.AddressMapper;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.UserMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public UserModel toModel(UserEntity entity) {
        return UserModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .address(addressMapper.toModel(entity.getAddress()))
                .build();
    }

    @Override
    public UserEntity toEntity(UserModel model) {
        return UserEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .email(model.getEmail())
                .password(model.getPassword())
                .address(addressMapper.toEntity(model.getAddress()))
                .build();
    }

    @Override
    public List<UserModel> toModelList(List<UserEntity> list) {
        return list.stream().map(this::toModel).toList();
    }
}
