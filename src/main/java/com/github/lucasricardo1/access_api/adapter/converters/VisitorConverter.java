package com.github.lucasricardo1.access_api.adapter.converters;

import com.github.lucasricardo1.access_api.adapter.dtos.VisitorDTO;
import com.github.lucasricardo1.access_api.core.domain.Person;
import com.github.lucasricardo1.access_api.core.domain.Visitor;
import org.springframework.stereotype.Component;

@Component
public class VisitorConverter {

    public Visitor toDomain(VisitorDTO visitorDTO){
        return new Visitor(
                visitorDTO.getId(),
                visitorDTO.getDocumentNumber(),
                new Person(null, visitorDTO.getName()));
    }

    public VisitorDTO toDTO(Visitor visitor) {
        return new VisitorDTO(
                visitor.getId(),
                visitor.getPerson().getName(),
                visitor.getDocumentNumber());
    }
}
