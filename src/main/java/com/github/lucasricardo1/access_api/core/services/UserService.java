package com.github.lucasricardo1.access_api.core.services;

import com.github.lucasricardo1.access_api.core.domain.User;
import com.github.lucasricardo1.access_api.core.ports.UserRepositoryPort;
import com.github.lucasricardo1.access_api.core.ports.UserServicePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserService implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public User createUser(User user) {
        try{
            if(userRepositoryPort.findByEmail(user.getEmail()).isPresent()){
                throw new IllegalAccessException("User already exists!");
            }
            return userRepositoryPort.create(user);
        } catch (RuntimeException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
