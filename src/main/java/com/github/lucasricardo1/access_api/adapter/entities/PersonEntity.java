package com.github.lucasricardo1.access_api.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_person")
public class PersonEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
