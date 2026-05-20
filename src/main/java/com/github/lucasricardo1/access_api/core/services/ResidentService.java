package com.github.lucasricardo1.access_api.core.services;

import com.github.lucasricardo1.access_api.core.domain.Resident;
import com.github.lucasricardo1.access_api.core.ports.ResidentRepositoryPort;
import com.github.lucasricardo1.access_api.core.ports.ResidentServicePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ResidentService implements ResidentServicePort {

    private final ResidentRepositoryPort residentRepositoryPort;

    @Override
    public Resident createResident(Resident resident) {

        if(residentRepositoryPort.findByDocumentNumber(resident.getDocumentNumber()).isPresent()){
            throw new IllegalArgumentException("Resident already exists!");
        }
        return residentRepositoryPort.create(resident);
    }
}
