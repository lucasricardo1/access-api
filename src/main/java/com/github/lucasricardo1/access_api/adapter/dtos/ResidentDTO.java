package com.github.lucasricardo1.access_api.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResidentDTO {
    private Long id;
    private String name;
    private String documentNumber;
    private String address;
    private String phoneNumber;
}
