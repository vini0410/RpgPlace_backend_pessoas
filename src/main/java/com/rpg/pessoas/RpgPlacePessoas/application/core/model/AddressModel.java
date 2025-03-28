package com.rpg.pessoas.RpgPlacePessoas.application.core.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressModel {

    private Long id;

    private String country;

    private String state;

    private String city;

    private String neighborhood;

    private String street;

    private Long number;
}
