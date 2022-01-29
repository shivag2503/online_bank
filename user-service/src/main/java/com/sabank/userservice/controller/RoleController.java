package com.sabank.userservice.controller;

import com.sabank.userservice.model.Role;
import com.sabank.userservice.model.UserDto;
import com.sabank.userservice.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;

    @RequestMapping(value="/role", method = RequestMethod.POST)
    public Role saveRole(@RequestBody Role role){
        return roleService.save(role);
    }
}
