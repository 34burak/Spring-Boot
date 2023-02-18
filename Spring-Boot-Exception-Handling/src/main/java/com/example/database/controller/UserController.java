package com.example.database.controller;






import com.example.database.advice.UserNotFound;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class UserController {



    @GetMapping("exception1")
    public ResponseEntity<Optional> createUser(){

    throw new IllegalArgumentException("Hata Mesajı");
    }
    @GetMapping("exception2")
    public ResponseEntity<Optional> createUser2(){

        throw new UserNotFound("Hata Mesajı2");
    }
}
