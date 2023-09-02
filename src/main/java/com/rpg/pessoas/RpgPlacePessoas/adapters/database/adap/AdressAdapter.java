package com.rpg.pessoas.RpgPlacePessoas.adapters.database.adap;

import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.AddressEntity;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.AddressMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdressAdapter implements AddressMapper {
    @Override
    public AddressModel toModel(AddressEntity entity) {
        return AddressModel.builder().build();
    }

    @Override
    public List<AddressModel> toModelList(List<AddressEntity> list) {
        return new ArrayList<>();
    }

    @Override
    public AddressEntity toEntity(AddressModel model) {
        return AddressEntity.builder().build();
    }
}
