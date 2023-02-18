package com.example.database.advice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ExceptionResponse {
    private LocalDateTime timeStamp;
    private String massage;
    private String code;
}
