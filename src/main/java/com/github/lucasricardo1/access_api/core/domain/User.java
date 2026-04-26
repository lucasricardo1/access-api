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
    private Long personId;

    public User(Long id, String email, String password, Boolean admin) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.admin = admin;
    }
}
