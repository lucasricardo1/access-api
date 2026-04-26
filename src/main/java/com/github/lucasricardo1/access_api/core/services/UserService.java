package com.github.lucasricardo1.access_api.core.services;

import com.github.lucasricardo1.access_api.core.domain.User;
import com.github.lucasricardo1.access_api.core.ports.UserServicePort;
import org.springframework.stereotype.Service;

public class UserService implements UserServicePort {

    @Override
    public User createUser(User user) {
        return user;
    }
}
