package com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "addresses")
public class AddressEntity {
    @Id
    private Long id;

    @Column
    private String rua;
}
