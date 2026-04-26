package com.github.lucasricardo1.access_api.core.ports;

import com.github.lucasricardo1.access_api.core.domain.User;

public interface UserServicePort {

    User createUser(User user);
}
