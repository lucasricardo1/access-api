package com.github.lucasricardo1.access_api.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Visit {
    private Long id;
    private LocalDateTime dateHour;
    private Long idResident;
    private Long idVisitor;
}
