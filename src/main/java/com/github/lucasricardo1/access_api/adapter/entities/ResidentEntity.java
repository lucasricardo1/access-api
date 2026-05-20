package com.github.lucasricardo1.access_api.adapter.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_resident")
public class ResidentEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String documentNumber;
    private String address;
    private String phoneNumber;
    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity personEntity;
}
