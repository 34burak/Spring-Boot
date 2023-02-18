package com.example.database.controller;

import com.example.database.dto.UserDto;
import com.example.database.entity.User1;
import com.example.database.service.UserService;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;


@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("save")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto resultUser= userService.createUser(userDto);
        return ResponseEntity.ok(resultUser);

    }
   @GetMapping("pagination")
    public ResponseEntity<Page<User1>> pagination(Pageable pageable){
        return ResponseEntity.ok(userService.pagination(pageable)); //http://localhost:8080/pagination?page=0&size=4&sort=name
   }
}
