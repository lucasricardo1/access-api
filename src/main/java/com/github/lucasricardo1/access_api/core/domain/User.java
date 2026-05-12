package com.github.lucasricardo1.access_api.core.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Long id;
    private String email;
    private String password;
    private Boolean admin;
    private Person person;

}
