package com.personal.client.service;

import com.personal.client.entity.UserEntity;
import com.personal.client.mapstruct.CustomUserMapper;
import com.personal.client.mapstruct.UserMapper;
import com.personal.client.model.UserDto;
import com.personal.client.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    CustomUserMapper customUserMapper;

    @Override
    public UserDto registerUser(UserDto user) {

        UserEntity userEntity = customUserMapper.toCustomUserEntity(user);
        userEntity = userRepository.save(userEntity);
        UserDto userDto =userMapper.toDto(userEntity);

        return userDto;
    }
}
