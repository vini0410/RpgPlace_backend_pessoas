package com.rpg.pessoas.RpgPlacePessoas.application.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AddressModel {

    private Long id;

    private String rua;
}
