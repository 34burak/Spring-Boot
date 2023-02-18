package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Required {
    @GetMapping(path = "/required/{massage}")
    public String sayMassage(@PathVariable(name="massage",required = false) String massage){
        return massage; //http://localhost:8080/required/mymassage
    }
    @GetMapping(path = "/required")
    public String sayMassage2(@RequestParam(name = "massage",required = false) String massage){
        return "massage="+massage; //http://localhost:8080/required?massage=mymassage
    }


}

