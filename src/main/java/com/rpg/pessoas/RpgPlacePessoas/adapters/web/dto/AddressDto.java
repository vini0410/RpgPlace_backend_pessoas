package com.rpg.pessoas.RpgPlacePessoas.adapters.web.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonNaming(SnakeCaseStrategy.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressDto {

    private Long id;

    private String country;

    private String state;

    private String city;

    private String neighborhood;

    private String street;

    private Long number;
}
