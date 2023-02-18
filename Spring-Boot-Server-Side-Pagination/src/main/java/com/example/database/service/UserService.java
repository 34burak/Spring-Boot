package com.example.database.service;

import com.example.database.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import com.example.database.entity.User1;

import org.springframework.data.domain.Pageable;
import java.util.List;


public interface UserService {

   UserDto createUser(UserDto userDto);
   Page<User1> pagination(Pageable pageable);
}
