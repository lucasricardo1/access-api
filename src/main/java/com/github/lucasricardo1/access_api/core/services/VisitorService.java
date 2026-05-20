package com.github.lucasricardo1.access_api.core.services;

import com.github.lucasricardo1.access_api.core.domain.Visitor;
import com.github.lucasricardo1.access_api.core.ports.VisitorRepositoryPort;
import com.github.lucasricardo1.access_api.core.ports.VisitorServicePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VisitorService implements VisitorServicePort {

    private final VisitorRepositoryPort visitorRepositoryPort;

    @Override
    public Visitor createVisitor(Visitor visitor) {

        if(visitorRepositoryPort.findByDocumentNumber(visitor.getDocumentNumber()).isPresent()){
            throw new IllegalArgumentException("Visitor already exists!");
        }

        return visitorRepositoryPort.create(visitor);
    }
}
