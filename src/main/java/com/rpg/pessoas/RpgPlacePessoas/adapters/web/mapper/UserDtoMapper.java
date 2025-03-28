package com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper;


import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.UserDto;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;

import java.util.List;

public interface UserDtoMapper {
    List<UserDto> toDtoList(List<UserModel> list);

    UserDto toDto(UserModel user);

    UserModel toModel (UserDto dto);
}
