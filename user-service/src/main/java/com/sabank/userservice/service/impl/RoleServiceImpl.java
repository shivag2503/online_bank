package com.sabank.userservice.service.impl;

import com.sabank.userservice.model.Role;
import com.sabank.userservice.repository.RoleRepository;
import com.sabank.userservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
