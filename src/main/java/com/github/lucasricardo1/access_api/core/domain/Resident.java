package com.github.lucasricardo1.access_api.core.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Resident {
    private Long id;
    private String documentNumber;
    private String address;
    private String phoneNumber;
    private Long personId;
}
