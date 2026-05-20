package com.github.lucasricardo1.access_api.core.ports;

import com.github.lucasricardo1.access_api.core.domain.Visitor;

import java.util.List;
import java.util.Optional;

public interface VisitorRepositoryPort {

    Visitor create(Visitor visitor);

    Optional<Visitor> findByDocumentNumber(String documentNumber);

    List<Visitor> findAll();
}
