package com.github.lucasricardo1.access_api.infra.handlers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {

    private String message;
}
