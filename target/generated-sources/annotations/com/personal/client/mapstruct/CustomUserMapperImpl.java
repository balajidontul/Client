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
public class CustomUserMapperImpl extends CustomUserMapper {

    @Override
    public UserEntity toCustomUserEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.id( userDto.getId() );
        userEntity.firstName( userDto.getFirstName() );
        userEntity.lastName( userDto.getLastName() );
        userEntity.email( userDto.getEmail() );
        userEntity.role( userDto.getRole() );
        userEntity.enabled( userDto.isEnabled() );

        userEntity.password( passwordEncoder.encode(userDto.getPassword()) );

        return userEntity.build();
    }
}
