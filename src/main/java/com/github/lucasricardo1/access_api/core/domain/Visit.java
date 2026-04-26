package com.github.lucasricardo1.access_api.core.domain;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Visit {
    private Long id;
    private LocalDateTime dateHour;
    private Long idResident;
    private Long idVisitor;
}
