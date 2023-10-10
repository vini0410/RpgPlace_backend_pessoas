package com.rpg.pessoas.RpgPlacePessoas.adapters.web.controller;

import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.UserDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.UserDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.usecase.LoginUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/login")
@RestController
@AllArgsConstructor
public class LoginController {

    @Autowired
    private LoginUseCase useCase;
    @Autowired
    private UserDtoMapper mapper;

    @PostMapping
    public UserDto loginUser(@RequestBody UserDto dto) {
        return mapper.toDto(useCase.loginUser(mapper.toModel(dto)));
    }

    @GetMapping()
    public UserDto getById(@RequestParam("email") String email) {
        return mapper.toDto(useCase.getByEmail(email));

    }
}
