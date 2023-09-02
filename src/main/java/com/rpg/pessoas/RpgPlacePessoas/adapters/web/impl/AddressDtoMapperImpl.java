package com.rpg.pessoas.RpgPlacePessoas.adapters.web.impl;

import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.AddressDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.AddressDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddressDtoMapperImpl implements AddressDtoMapper {
    @Override
    public List<AddressDto> toDtoList(List<AddressModel> list) {
        return new ArrayList<>();
    }

    @Override
    public AddressDto toDto(AddressModel user) {
        return AddressDto.builder().build();
    }

    @Override
    public AddressModel toModel(AddressDto dto) {
        return AddressModel.builder().build();
    }
}
