package com.github.lucasricardo1.access_api.core.ports;

import com.github.lucasricardo1.access_api.core.domain.Visitor;

import java.util.List;

public interface VisitorServicePort {

    Visitor createVisitor(Visitor visitor);

    Visitor findByDocumentNumber(String documentNumber);

    List<Visitor> findAll();
}
