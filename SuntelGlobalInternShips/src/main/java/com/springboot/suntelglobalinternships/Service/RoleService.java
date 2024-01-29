package com.springboot.suntelglobalinternships.Service;

import com.springboot.suntelglobalinternships.Exception.ResourceIsMissing;
import com.springboot.suntelglobalinternships.Model.Role;
import com.springboot.suntelglobalinternships.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public String getRoleName(UUID rId){
        Role role= roleRepository.findById(rId).orElseThrow(()->new ResourceIsMissing("Resource is'nt there !!"));
        return role.getRoleName();
    }
}
