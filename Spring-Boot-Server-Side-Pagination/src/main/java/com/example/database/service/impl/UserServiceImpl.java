package com.example.database.service.impl;

import com.example.database.dto.UserDto;
import com.example.database.entity.User1;
import com.example.database.repository.UserRepository;
import com.example.database.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
private User1 user1;
@Autowired
private UserRepository userRepository;
@Autowired
private ModelMapper modelMapper;
    @Override
    public UserDto createUser(UserDto userDto) {
        User1 user1= modelMapper.map(userDto,User1.class);
        user1.setCreatedDate(new Date());

        return modelMapper.map(userRepository.save(user1), UserDto.class) ;
    }



    @Override
    public Page<User1> pagination(Pageable pageable) {

        return userRepository.findAll(pageable);
    }




}
