package com.personal.client.model;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    @Setter
    private String password;
    private String role;
    private boolean enabled = false;
}
