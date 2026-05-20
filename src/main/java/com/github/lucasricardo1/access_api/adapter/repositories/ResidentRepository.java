package com.github.lucasricardo1.access_api.adapter.repositories;

import com.github.lucasricardo1.access_api.adapter.entities.ResidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResidentRepository extends JpaRepository<ResidentEntity, Long> {

    Optional<ResidentEntity> findByDocumentNumber(String documentNumber);
}
