package com.fr.demenstration.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class ApiErrorResponse {
    private int code;
    private String message;
}

