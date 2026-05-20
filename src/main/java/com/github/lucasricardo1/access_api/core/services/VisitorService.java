package com.github.lucasricardo1.access_api.core.services;

import com.github.lucasricardo1.access_api.core.domain.Visitor;
import com.github.lucasricardo1.access_api.core.ports.VisitorRepositoryPort;
import com.github.lucasricardo1.access_api.core.ports.VisitorServicePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

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

    @Override
    public Visitor findByDocumentNumber(String documentNumber) {
        return visitorRepositoryPort.findByDocumentNumber(documentNumber)
                .orElseThrow(() -> new IllegalArgumentException("Visitor not found"));
    }

    @Override
    public List<Visitor> findAll() {
        return visitorRepositoryPort.findAll();
    }
}
