package com.github.lucasricardo1.access_api.adapter.converters;

import com.github.lucasricardo1.access_api.adapter.dtos.ResidentDTO;
import com.github.lucasricardo1.access_api.core.domain.Person;
import com.github.lucasricardo1.access_api.core.domain.Resident;
import org.springframework.stereotype.Component;

@Component
public class ResidentConverter {

    public Resident toDomain(ResidentDTO residentDTO){
        return new Resident(
                residentDTO.getId(),
                residentDTO.getDocumentNumber(),
                residentDTO.getAddress(),
                residentDTO.getPhoneNumber(),
                new Person(null, residentDTO.getName()));
    }

    public ResidentDTO toDTO(Resident resident){
        return new ResidentDTO(
                resident.getId(),
                resident.getPerson().getName(),
                resident.getDocumentNumber(),
                resident.getAddress(),
                resident.getPhoneNumber());
    }
}
