package com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper;

import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.AddressDto;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;

import java.util.List;

public interface AddressDtoMapper {

    List<AddressDto> toDtoList(List<AddressModel> list);

    AddressDto toDto(AddressModel user);

    AddressModel toModel(AddressDto dto);
}
