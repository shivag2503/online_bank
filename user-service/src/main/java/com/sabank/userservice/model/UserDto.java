package com.sabank.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private String username;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private String email;
    private String mobile;
    private String landline;
}
