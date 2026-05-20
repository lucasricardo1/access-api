package com.github.lucasricardo1.access_api.adapter.controllers;

import com.github.lucasricardo1.access_api.adapter.converters.VisitorConverter;
import com.github.lucasricardo1.access_api.adapter.dtos.VisitorDTO;
import com.github.lucasricardo1.access_api.core.domain.Visitor;
import com.github.lucasricardo1.access_api.core.ports.VisitorServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/visitors")
public class VisitorController {

    private final VisitorServicePort visitorServicePort;
    private final VisitorConverter visitorConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitorDTO create(@RequestBody VisitorDTO visitorDTO){

        Visitor visitor = visitorServicePort.createVisitor(visitorConverter.toDomain(visitorDTO));
        return visitorConverter.toDTO(visitor);
    }

    @GetMapping("/{documentNumber}")
    public VisitorDTO findByDocumentNumber(@PathVariable String documentNumber){
        return visitorConverter.toDTO(visitorServicePort.findByDocumentNumber(documentNumber));
    }

    @GetMapping
    public List<VisitorDTO> findAll(){
        return visitorServicePort.findAll().stream()
                .map(visitorConverter::toDTO)
                .collect(Collectors.toList());
    }
}
