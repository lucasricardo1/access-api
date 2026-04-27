package com.github.lucasricardo1.access_api.adapter.repositories;

import com.github.lucasricardo1.access_api.adapter.entities.UserEntity;
import com.github.lucasricardo1.access_api.core.domain.User;
import com.github.lucasricardo1.access_api.core.ports.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {


    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public User create(User user) {
        UserEntity entity = modelMapper.map(user, UserEntity.class);
        return modelMapper.map(userRepository.saveAndFlush(entity), User.class);
    }
}
