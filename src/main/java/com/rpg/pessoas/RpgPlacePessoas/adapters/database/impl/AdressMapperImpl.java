package com.rpg.pessoas.RpgPlacePessoas.adapters.database.impl;

import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.AddressEntity;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.AddressMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class AdressMapperImpl implements AddressMapper {
    @Override
    public AddressModel toModel(AddressEntity entity) {
        return AddressModel.builder()
                .id(validar(entity.getId()))
                .country(validar(entity.getCountry()))
                .state(validar(entity.getState()))
                .city(validar(entity.getCity()))
                .neighborhood(validar(entity.getNeighborhood()))
                .street(validar(entity.getStreet()))
                .number(validar(entity.getNumber()))
                .build();
    }

    @Override
    public AddressEntity toEntity(AddressModel model) {
        return AddressEntity.builder()
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
    public List<AddressModel> toModelList(List<AddressEntity> list) {
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
