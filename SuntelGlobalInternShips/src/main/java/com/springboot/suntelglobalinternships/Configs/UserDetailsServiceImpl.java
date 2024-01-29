package com.springboot.suntelglobalinternships.Configs;

import com.springboot.suntelglobalinternships.Model.User;
import com.springboot.suntelglobalinternships.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // We have to fetch data of User from our Database
        User user=userRepository.getUserByEmail(username); // Our Mail id is our userName...
        if(user==null){
            throw  new UsernameNotFoundException("Can't Find User!");
        }
        CustomUserDetails customUserDetails=new CustomUserDetails(user);

        return customUserDetails;
    }
}
