package com.github.lucasricardo1.access_api.adapter.repositories;

import com.github.lucasricardo1.access_api.adapter.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);
}
