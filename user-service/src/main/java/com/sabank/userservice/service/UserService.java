package com.sabank.userservice.service;

import com.sabank.userservice.model.User;
import com.sabank.userservice.model.UserDto;

public interface UserService {

    User save(UserDto user);
}
