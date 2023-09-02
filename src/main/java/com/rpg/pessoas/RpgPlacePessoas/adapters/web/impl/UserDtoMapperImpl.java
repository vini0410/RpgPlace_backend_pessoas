package com.rpg.pessoas.RpgPlacePessoas.adapters.web.impl;


import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.UserDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.UserDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDtoMapperImpl implements UserDtoMapper {
    @Override
    public List<UserDto> toDtoList(List<UserModel> all) {
        return new ArrayList<>();
    }

    @Override
    public UserDto toDto(UserModel user) {
        return UserDto.builder().build();
    }

    @Override
    public UserModel toModel(UserDto dto) {
        return UserModel.builder().build();
    }
}
