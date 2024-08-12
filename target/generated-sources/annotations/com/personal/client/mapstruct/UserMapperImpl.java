package com.personal.client.mapstruct;

import com.personal.client.entity.UserEntity;
import com.personal.client.model.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-12T21:14:33+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.id( entity.getId() );
        userDto.firstName( entity.getFirstName() );
        userDto.lastName( entity.getLastName() );
        userDto.email( entity.getEmail() );
        userDto.password( entity.getPassword() );
        userDto.role( entity.getRole() );
        userDto.enabled( entity.isEnabled() );

        return userDto.build();
    }

    @Override
    public UserEntity toEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.id( dto.getId() );
        userEntity.firstName( dto.getFirstName() );
        userEntity.lastName( dto.getLastName() );
        userEntity.email( dto.getEmail() );
        userEntity.password( dto.getPassword() );
        userEntity.role( dto.getRole() );
        userEntity.enabled( dto.isEnabled() );

        return userEntity.build();
    }
}
