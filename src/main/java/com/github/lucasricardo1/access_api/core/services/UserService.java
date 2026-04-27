package com.github.lucasricardo1.access_api.core.services;

import com.github.lucasricardo1.access_api.core.domain.User;
import com.github.lucasricardo1.access_api.core.ports.UserRepositoryPort;
import com.github.lucasricardo1.access_api.core.ports.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class UserService implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public User createUser(User user) {
        return userRepositoryPort.create(user);
    }
}
