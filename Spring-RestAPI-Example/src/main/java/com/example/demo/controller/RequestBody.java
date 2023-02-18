package com.example.demo.controller;

import com.example.demo.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestBody {
    @GetMapping("/body")
    public User getUser(@org.springframework.web.bind.annotation.RequestBody User user){
        System.out.println("asd");
        return user;
    }

    @GetMapping("/users")
        public List<User> getUsers(@org.springframework.web.bind.annotation.RequestBody List<User> users){
         users.forEach(user->user.setSurname(""));
         return users;
        }
}

