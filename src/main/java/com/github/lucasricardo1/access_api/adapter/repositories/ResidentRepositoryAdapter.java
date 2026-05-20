package com.github.lucasricardo1.access_api.adapter.repositories;

import com.github.lucasricardo1.access_api.adapter.entities.PersonEntity;
import com.github.lucasricardo1.access_api.adapter.entities.ResidentEntity;
import com.github.lucasricardo1.access_api.core.domain.Person;
import com.github.lucasricardo1.access_api.core.domain.Resident;
import com.github.lucasricardo1.access_api.core.ports.ResidentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ResidentRepositoryAdapter implements ResidentRepositoryPort {


    private final ResidentRepository residentRepository;
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;


    @Override
    public Resident create(Resident resident) {
        ResidentEntity entity = modelMapper.map(resident, ResidentEntity.class);
        entity.setPersonEntity(createPerson(resident.getPerson()));
        return modelMapper.map(residentRepository.saveAndFlush(entity), Resident.class);
    }

    @Override
    public Optional<Resident> findByDocumentNumber(String documentNumber) {
        Optional<ResidentEntity> resident = residentRepository.findByDocumentNumber(documentNumber);
        if(resident.isEmpty()){
            return Optional.empty();
        }
        return Optional.ofNullable(modelMapper.map(resident, Resident.class));
    }


    private PersonEntity createPerson(Person person){
        PersonEntity personEntity = modelMapper.map(person, PersonEntity.class);
        return personRepository.saveAndFlush(personEntity);
    }
}
