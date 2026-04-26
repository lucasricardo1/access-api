package com.github.lucasricardo1.access_api.adapter.converters;

import com.github.lucasricardo1.access_api.adapter.dtos.UserDTO;
import com.github.lucasricardo1.access_api.core.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User toDomain(UserDTO userDTO){
        return new User(userDTO.getId(), userDTO.getEmail(), userDTO.getPassword(), userDTO.getAdmin());
    }

    public UserDTO toDTO(User user){
        return new UserDTO(user.getId(), null, user.getEmail(), user.getPassword(), user.getAdmin());
    }
}
