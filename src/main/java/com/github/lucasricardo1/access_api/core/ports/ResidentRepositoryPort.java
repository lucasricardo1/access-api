package com.github.lucasricardo1.access_api.core.ports;

import com.github.lucasricardo1.access_api.core.domain.Resident;

import java.util.Optional;

public interface ResidentRepositoryPort {

    Resident create(Resident resident);

    Optional<Resident> findByDocumentNumber(String documentNumber);
}
