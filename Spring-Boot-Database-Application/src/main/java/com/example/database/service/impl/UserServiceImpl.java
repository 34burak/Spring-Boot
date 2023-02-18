package com.example.database.service.impl;

import com.example.database.dto.UserDto;
import com.example.database.entity.User1;
import com.example.database.repository.UserRepository;
import com.example.database.service.UserService;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
    public List<User1> getUsers() {

        return userRepository.findAll();
    }

    @Override
    public User1 getById(Long id) {
Optional <User1> user1 = userRepository.findById(id);
if(user1.isPresent()){
    return user1.get();}
return null;
    }
}
