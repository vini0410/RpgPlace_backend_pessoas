package com.rpg.pessoas.RpgPlacePessoas.adapters.database.repository;


import com.rpg.pessoas.RpgPlacePessoas.adapters.database.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
