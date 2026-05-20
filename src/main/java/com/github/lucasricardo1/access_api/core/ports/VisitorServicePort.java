package com.github.lucasricardo1.access_api.core.ports;

import com.github.lucasricardo1.access_api.core.domain.Visitor;

public interface VisitorServicePort {

    Visitor createVisitor(Visitor visitor);
}
