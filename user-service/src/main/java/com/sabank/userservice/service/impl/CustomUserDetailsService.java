package com.sabank.userservice.service.impl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if (Objects.equals(userName, "Shivam")) {
            return new User("Shivam", "shivam25",  new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found!!");
        }
    }
}
