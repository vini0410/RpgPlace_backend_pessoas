package com.rpg.pessoas.RpgPlacePessoas.adapters.database.impl;


import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.UserEntity;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.AddressMapper;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.UserMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public UserModel toModel(UserEntity entity) {
        return UserModel.builder()
                .id(validar(entity.getId()))
                .name(validar(entity.getName()))
                .email(validar(entity.getEmail()))
                .password(validar(entity.getPassword()))
                .address(Objects.isNull(entity.getAddress()) ? null : addressMapper.toModel(entity.getAddress()))
                .build();
    }

    @Override
    public UserEntity toEntity(UserModel model) {
        return UserEntity.builder()
                .id(validar(model.getId()))
                .name(validar(model.getName()))
                .email(validar(model.getEmail()))
                .password(validar(model.getPassword()))
                .address(Objects.isNull(model.getAddress()) ? null : addressMapper.toEntity(model.getAddress()))
                .build();
    }

    @Override
    public List<UserModel> toModelList(List<UserEntity> list) {
        return list.stream().map(this::toModel).toList();
    }

    private Long validar(Long obj) {
        if (Objects.isNull(obj)) {
            return null;
        }
        return obj;
    }

    private String validar(String obj) {
        if (Objects.isNull(obj)) {
            return null;
        }
        return obj;
    }
}
