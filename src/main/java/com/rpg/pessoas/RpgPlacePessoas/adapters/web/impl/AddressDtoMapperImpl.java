package com.rpg.pessoas.RpgPlacePessoas.adapters.web.impl;

import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.AddressDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.AddressDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressDtoMapperImpl implements AddressDtoMapper {
    @Override
    public AddressDto toDto(AddressModel model) {
        return AddressDto.builder()
                .id(model.getId())
                .country(model.getCountry())
                .state(model.getState())
                .city(model.getCity())
                .neighborhood(model.getNeighborhood())
                .street(model.getStreet())
                .number(model.getNumber())
                .build();
    }

    @Override
    public AddressModel toModel(AddressDto dto) {
        return AddressModel.builder()
                .id(dto.getId())
                .country(dto.getCountry())
                .state(dto.getState())
                .city(dto.getCity())
                .neighborhood(dto.getNeighborhood())
                .street(dto.getStreet())
                .number(dto.getNumber())
                .build();
    }

    @Override
    public List<AddressDto> toDtoList(List<AddressModel> list) {
        return list.stream().map(this::toDto).toList();
    }
}
