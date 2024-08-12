package com.personal.client.service;

import com.personal.client.entity.UserEntity;
import com.personal.client.model.UserDto;

public interface UserService {

    UserDto registerUser(UserDto user);
}
