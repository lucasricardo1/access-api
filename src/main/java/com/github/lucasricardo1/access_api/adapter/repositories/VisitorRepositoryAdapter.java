package com.github.lucasricardo1.access_api.adapter.repositories;

import com.github.lucasricardo1.access_api.adapter.entities.PersonEntity;
import com.github.lucasricardo1.access_api.adapter.entities.VisitorEntity;
import com.github.lucasricardo1.access_api.core.domain.Person;
import com.github.lucasricardo1.access_api.core.domain.Visitor;
import com.github.lucasricardo1.access_api.core.ports.VisitorRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VisitorRepositoryAdapter implements VisitorRepositoryPort {

    private final VisitorRepository visitorRepository;
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    @Override
    public Visitor create(Visitor visitor) {
        VisitorEntity entity = modelMapper.map(visitor, VisitorEntity.class);
        entity.setPersonEntity(createPerson(visitor.getPerson()));
        return modelMapper.map(visitorRepository.saveAndFlush(entity), Visitor.class);
    }

    @Override
    public Optional<Visitor> findByDocumentNumber(String documentNumber) {
        Optional<VisitorEntity> entity = visitorRepository.findByDocumentNumber(documentNumber);

        if(entity.isEmpty()){
            return Optional.empty();
        }
        return Optional.ofNullable(modelMapper.map(entity, Visitor.class));
    }

    private PersonEntity createPerson(Person person){
        PersonEntity personEntity = modelMapper.map(person, PersonEntity.class);
        return personRepository.saveAndFlush(personEntity);
    }
}
