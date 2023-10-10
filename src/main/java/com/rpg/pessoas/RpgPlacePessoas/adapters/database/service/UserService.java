package com.rpg.pessoas.RpgPlacePessoas.adapters.database.service;

import com.rpg.pessoas.RpgPlacePessoas.adapters.database.mapper.UserMapper;
import com.rpg.pessoas.RpgPlacePessoas.adapters.database.repository.UserRepository;
import com.rpg.pessoas.RpgPlacePessoas.application.core.model.UserModel;
import com.rpg.pessoas.RpgPlacePessoas.port.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService implements UserPort {

    @Autowired
    private UserRepository repository;
    @Autowired
    private UserMapper mapper;

    @Override
    public UserModel findById(Long id) {
        var response = repository.findById(id);
        return response.map(userEntity -> mapper.toModel(userEntity)).orElse(null);

    }

    @Override
    public UserModel findByEmail(String email) {
        var response = repository.findByEmail(email);
        return response.map(userEntity -> mapper.toModel(userEntity)).orElse(null);
    }

    @Override
    public List<UserModel> findAll() {
        return mapper.toModelList(repository.findAll());
    }

    @Override
    public UserModel save(UserModel model) {
        return mapper.toModel(repository.save(mapper.toEntity(model)));
    }


}
