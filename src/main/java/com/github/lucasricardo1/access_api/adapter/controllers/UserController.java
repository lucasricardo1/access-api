package com.github.lucasricardo1.access_api.adapter.controllers;

import com.github.lucasricardo1.access_api.adapter.converters.UserConverter;
import com.github.lucasricardo1.access_api.adapter.dtos.UserDTO;
import com.github.lucasricardo1.access_api.core.ports.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserServicePort userServicePort;
    private final UserConverter userConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody UserDTO userDTO){
        return userConverter
                .toDTO(userServicePort.createUser(userConverter.toDomain(userDTO)));
    }
}
