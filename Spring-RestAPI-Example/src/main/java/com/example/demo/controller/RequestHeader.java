package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHeader {
    @GetMapping("/header")
    public String getHeader(@org.springframework.web.bind.annotation.RequestHeader("my-header") String header){
        return "header is "+ header;
    }
}
