package com.rpg.pessoas.RpgPlacePessoas.adapters.web.impl;


import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.UserDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.AddressDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.UserDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDtoMapperImpl implements UserDtoMapper {

    @Autowired
    private AddressDtoMapper addressDtoMapper;

    @Override
    public UserDto toDto(UserModel model) {
        return UserDto.builder()
                .id(model.getId())
                .name(model.getName())
                .email(model.getEmail())
                .password(model.getPassword())
                .addressDto(addressDtoMapper.toDto(model.getAddress()))
                .build();
    }

    @Override
    public UserModel toModel(UserDto dto) {
        return UserModel.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .address(addressDtoMapper.toModel(dto.getAddressDto()))
                .build();
    }

    @Override
    public List<UserDto> toDtoList(List<UserModel> list) {
        return list.stream().map(this::toDto).toList();
    }
}
