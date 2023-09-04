package com.rpg.pessoas.RpgPlacePessoas.adapters.database.impl;

import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.AddressEntity;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.AddressMapper;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.UserMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdressMapperImpl implements AddressMapper {
    @Override
    public AddressModel toModel(AddressEntity entity) {
        return AddressModel.builder()
                .id(entity.getId())
                .country(entity.getCountry())
                .state(entity.getState())
                .city(entity.getCity())
                .neighborhood(entity.getNeighborhood())
                .street(entity.getStreet())
                .number(entity.getNumber())
                .build();
    }

    @Override
    public AddressEntity toEntity(AddressModel model) {
        return AddressEntity.builder()
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
    public List<AddressModel> toModelList(List<AddressEntity> list) {
        return list.stream().map(this::toModel).toList();
    }
}
