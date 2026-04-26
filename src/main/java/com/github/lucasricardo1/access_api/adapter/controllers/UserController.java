package com.github.lucasricardo1.access_api.adapter.controllers;

import com.github.lucasricardo1.access_api.adapter.dtos.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody UserDTO userDTO){
        return userDTO;
    }
}
