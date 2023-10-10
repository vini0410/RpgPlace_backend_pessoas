package com.rpg.pessoas.RpgPlacePessoas.adapters.web.impl;


import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.UserDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.AddressDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.UserDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class UserDtoMapperImpl implements UserDtoMapper {

    @Autowired
    private AddressDtoMapper addressDtoMapper;

    @Override
    public UserDto toDto(UserModel model) {
        return UserDto.builder()
                .id(validar(model.getId()))
                .name(validar(model.getName()))
                .email(validar(model.getEmail()))
                .password(validar(model.getPassword()))
                .address(Objects.isNull(model.getAddress()) ? null : addressDtoMapper.toDto(model.getAddress()))
                .build();
    }

    @Override
    public UserModel toModel(UserDto dto) {
        return UserModel.builder()
                .id(validar(dto.getId()))
                .name(validar(dto.getName()))
                .email(validar(dto.getEmail()))
                .password(validar(dto.getPassword()))
                .address(Objects.isNull(dto.getAddress()) ? null : addressDtoMapper.toModel(dto.getAddress()))
                .build();
    }

    @Override
    public List<UserDto> toDtoList(List<UserModel> list) {
        return list.stream().map(this::toDto).toList();
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
