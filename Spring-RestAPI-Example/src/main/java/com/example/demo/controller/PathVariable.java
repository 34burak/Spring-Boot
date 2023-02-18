package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PathVariable {
    @GetMapping(path = "/hello/{massage}")
    public String sayMyMassage(@org.springframework.web.bind.annotation.PathVariable String massage){
        return massage;
    }
    @GetMapping(path = "/hello/")
    public String sayMyMassage2(@org.springframework.web.bind.annotation.PathVariable("massage2") String massage2){
        return massage2;
    }
}
