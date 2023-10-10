package com.rpg.pessoas.RpgPlacePessoas.application.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserModel {

    private Long id;

    private String name;

    private String email;

    private String password;

    private AddressModel address;

}
