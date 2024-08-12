package com.personal.client.mapstruct;

import com.personal.client.entity.UserEntity;
import com.personal.client.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    public UserDto toDto(UserEntity entity);

    public UserEntity toEntity(UserDto dto);
}