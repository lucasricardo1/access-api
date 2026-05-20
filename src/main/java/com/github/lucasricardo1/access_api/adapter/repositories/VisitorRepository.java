package com.github.lucasricardo1.access_api.adapter.repositories;

import com.github.lucasricardo1.access_api.adapter.entities.VisitorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitorRepository extends JpaRepository<VisitorEntity, Long> {

    Optional<VisitorEntity> findByDocumentNumber(String documentNumber);
}
