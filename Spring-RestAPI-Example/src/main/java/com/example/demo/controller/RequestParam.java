package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParam {
    @GetMapping(path = "/RequestParam")
    public String RequestPrm(@org.springframework.web.bind.annotation.RequestParam("name") String name){
        return name;//http://localhost:8080/RequestParam?name=Burak
    }

}
