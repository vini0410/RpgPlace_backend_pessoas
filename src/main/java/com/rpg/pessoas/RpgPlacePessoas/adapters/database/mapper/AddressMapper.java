package com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper;

import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.AddressEntity;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;

import java.util.List;

public interface AddressMapper {

    AddressModel toModel(AddressEntity entity);

    List<AddressModel> toModelList(List<AddressEntity> list);

    AddressEntity toEntity(AddressModel model);
}
