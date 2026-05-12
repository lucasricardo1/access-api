package com.github.lucasricardo1.access_api.core.ports;

import com.github.lucasricardo1.access_api.core.domain.User;

import java.util.Optional;

public interface UserRepositoryPort {

    User create(User user);

    Optional<User> findByEmail(String email);
}
