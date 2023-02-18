package com.example.database.service;

import com.example.database.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.database.entity.User1;

import java.util.List;


public interface UserService {

   UserDto createUser(UserDto userDto);
   List<User1> getUsers();
   User1 getById(Long id);
}
