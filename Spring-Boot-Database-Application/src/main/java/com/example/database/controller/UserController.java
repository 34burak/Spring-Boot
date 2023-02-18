package com.example.database.controller;

import com.example.database.dto.UserDto;
import com.example.database.entity.User1;
import com.example.database.service.UserService;
import com.example.database.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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
    @GetMapping("getusers")
    public ResponseEntity<List<User1>> getUsers(){
        List users= userService.getUsers();
        return ResponseEntity.ok(users);
    }
@GetMapping("getbyid/{id}")
    public ResponseEntity<User1> getById(@PathVariable Long id){
        User1 user1=userService.getById(id);
        return ResponseEntity.ok(user1);
}
}
