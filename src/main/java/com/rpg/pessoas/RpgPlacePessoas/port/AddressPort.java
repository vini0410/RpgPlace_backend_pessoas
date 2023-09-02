package com.rpg.pessoas.RpgPlacePessoas.port;

import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;

import java.util.List;

public interface AddressPort {

    AddressModel findById(Long id);

    List<AddressModel> findAll();

    AddressModel save (AddressModel model);
}
