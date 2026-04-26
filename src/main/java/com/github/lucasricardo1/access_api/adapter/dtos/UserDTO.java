package com.github.lucasricardo1.access_api.adapter.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Boolean admin;

}
