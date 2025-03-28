package com.rpg.pessoas.RpgPlacePessoas.adapters.web.controller;

import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.UserDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.UserDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.exception.CoreException;
import com.rpg.pessoas.RpgPlacePessoas.application.core.usecase.RegisterUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@CrossOrigin
@RequestMapping("/register")
@RestController
@AllArgsConstructor
public class RegisterController {

    @Autowired
    private RegisterUseCase useCase;
    @Autowired
    private UserDtoMapper mapper;

    @PostMapping
    public UserDto addUser(@RequestBody UserDto dto) {
        validaUserIn(dto);
        return mapper.toDto(useCase.addUser(mapper.toModel(dto)));
    }

    private void validaUserIn(UserDto dto) {
        validaCampo("Email", dto.getEmail());
        validaCampo("Name", dto.getName());
        validaCampo("Password", dto.getPassword());

        // validar email
    }

    private void validaCampo(String campo, Object obj) {
        if (Objects.isNull(obj)) {
            throw new CoreException(String.format("Erro no campo %s", campo));
        }
    }
}
