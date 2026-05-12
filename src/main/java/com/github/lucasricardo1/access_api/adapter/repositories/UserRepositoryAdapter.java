package com.github.lucasricardo1.access_api.adapter.repositories;

import com.github.lucasricardo1.access_api.adapter.entities.PersonEntity;
import com.github.lucasricardo1.access_api.adapter.entities.UserEntity;
import com.github.lucasricardo1.access_api.core.domain.Person;
import com.github.lucasricardo1.access_api.core.domain.User;
import com.github.lucasricardo1.access_api.core.ports.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {


    private final UserRepository userRepository;
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    @Override
    public User create(User user) {
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userEntity.setPersonEntity(createPerson(user.getPerson()));
        return modelMapper.map(userRepository.saveAndFlush(userEntity), User.class);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        Optional<UserEntity> userEmail = userRepository.findByEmail(email);
        if(userEmail.isEmpty()){
            return Optional.empty();
        }
        return Optional.ofNullable(modelMapper.map(userEmail, User.class));
    }

    private PersonEntity createPerson(Person person){
        PersonEntity personEntity = modelMapper.map(person, PersonEntity.class);
        return personRepository.saveAndFlush(personEntity);
    }
}
