package com.github.lucasricardo1.access_api.adapter.controllers;

import com.github.lucasricardo1.access_api.adapter.converters.ResidentConverter;
import com.github.lucasricardo1.access_api.adapter.dtos.ResidentDTO;
import com.github.lucasricardo1.access_api.core.domain.Resident;
import com.github.lucasricardo1.access_api.core.ports.ResidentServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/residents")
public class ResidentController {

    private final ResidentServicePort residentServicePort;
    private final ResidentConverter residentConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResidentDTO create(@RequestBody ResidentDTO residentDTO){

        Resident newResident = residentServicePort.createResident(residentConverter.toDomain(residentDTO));
        return residentConverter.toDTO(newResident);
    }
}
