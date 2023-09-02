package com.rpg.pessoas.RpgPlacePessoas.adapters.web.controller;

import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.UserDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.UserDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.usecase.UserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/client")
@RestController
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserUseCase useCase;
    @Autowired
    private UserDtoMapper mapper;

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable Long id) {
        return mapper.toDto(useCase.findUser(id));
    }

    @GetMapping("/all")
    public List<UserDto> findAll() {
        return mapper.toDtoList(useCase.findAll());
    }

    @PostMapping
    public UserDto addUser(@RequestBody UserDto dto) {
        return mapper.toDto(useCase.addUser(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public UserDto updateUser(@PathVariable Long id, @RequestBody UserDto dto) {
        return mapper.toDto(useCase.updateUser(id, mapper.toModel(dto)));
    }


}
