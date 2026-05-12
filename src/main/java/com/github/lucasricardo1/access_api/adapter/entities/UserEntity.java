package com.github.lucasricardo1.access_api.adapter.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_user")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private Boolean admin;
    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity personEntity;
}
