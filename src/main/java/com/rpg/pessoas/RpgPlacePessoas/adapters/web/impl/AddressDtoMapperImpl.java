package com.rpg.pessoas.RpgPlacePessoas.adapters.web.impl;

import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.AddressDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.AddressDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class AddressDtoMapperImpl implements AddressDtoMapper {
    @Override
    public AddressDto toDto(AddressModel model) {
        return AddressDto.builder()
                .id(validar(model.getId()))
                .country(validar(model.getCountry()))
                .state(validar(model.getState()))
                .city(validar(model.getCity()))
                .neighborhood(validar(model.getNeighborhood()))
                .street(validar(model.getStreet()))
                .number(validar(model.getNumber()))
                .build();
    }

    @Override
    public AddressModel toModel(AddressDto dto) {
        return AddressModel.builder()
                .id(validar(dto.getId()))
                .country(validar(dto.getCountry()))
                .state(validar(dto.getState()))
                .city(validar(dto.getCity()))
                .neighborhood(validar(dto.getNeighborhood()))
                .street(validar(dto.getStreet()))
                .number(validar(dto.getNumber()))
                .build();
    }

    @Override
    public List<AddressDto> toDtoList(List<AddressModel> list) {
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
