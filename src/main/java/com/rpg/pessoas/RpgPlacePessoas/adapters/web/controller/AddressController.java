package com.rpg.pessoas.RpgPlacePessoas.adapters.web.controller;

import com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto.AddressDto;
import com.rpg.pessoas.RpgPlacePessoas.adapters.web.mapper.AddressDtoMapper;
import com.rpg.pessoas.RpgPlacePessoas.application.core.usecase.AddressUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/address")
@RestController
@AllArgsConstructor
public class AddressController {

    @Autowired
    private AddressUseCase useCase;

    @Autowired
    private AddressDtoMapper mapper;

    @GetMapping("/{id}")
    public AddressDto findById(@PathVariable Long id) {
        return mapper.toDto(useCase.findAddress(id));
    }

    @GetMapping("/all")
    public List<AddressDto> findAll() {
        return mapper.toDtoList(useCase.findAll());
    }

    @PostMapping
    public AddressDto addUser(@RequestBody AddressDto dto) {
        return mapper.toDto(useCase.addAddress(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public AddressDto updateUser(@PathVariable Long id, @RequestBody AddressDto dto) {
        return mapper.toDto(useCase.updateUser(id, mapper.toModel(dto)));
    }

}
