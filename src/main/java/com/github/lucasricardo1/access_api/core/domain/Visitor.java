package com.github.lucasricardo1.access_api.core.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Visitor {

    private Long id;
    private String documentNumber;
    private Long personId;
}
