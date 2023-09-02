package com.rpg.pessoas.RpgPlacePessoas.adapters.database.service;

import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.AddressMapper;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.repository.AddressRepository;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.AddressModel;
import com.rpg.pessoas.RpgPlacePessoas.port.AddressPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressService implements AddressPort {

    @Autowired
    private AddressRepository repository;

    @Autowired
    private AddressMapper mapper;


    @Override
    public AddressModel findById(Long id) {
        var response = repository.findById(id);
        return response.map(addressEntity -> mapper.toModel(addressEntity)).orElse(null);
    }

    @Override
    public List<AddressModel> findAll() {
        return mapper.toModelList(repository.findAll());
    }

    @Override
    public AddressModel save(AddressModel model) {
        return mapper.toModel(repository.save(mapper.toEntity(model)));
    }
}
