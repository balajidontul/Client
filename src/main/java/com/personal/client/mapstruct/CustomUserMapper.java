package com.personal.client.mapstruct;

import com.personal.client.entity.UserEntity;
import com.personal.client.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

@Mapper
public abstract class CustomUserMapper {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Mapping(target = "password", expression = "java(passwordEncoder.encode(userDto.getPassword()))")
    public abstract UserEntity toCustomUserEntity(UserDto userDto);


}
