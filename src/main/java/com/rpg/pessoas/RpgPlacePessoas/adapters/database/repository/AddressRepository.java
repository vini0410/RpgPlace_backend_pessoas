package com.rpg.pessoas.RpgPlacePessoas.adapters.database.repository;

import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
