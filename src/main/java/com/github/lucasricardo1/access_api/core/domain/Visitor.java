package com.github.lucasricardo1.access_api.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Visitor {

    private Long id;
    private String documentNumber;
    private Long personId;
}
