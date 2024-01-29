package com.springboot.suntelglobalinternships.Controller;

import com.springboot.suntelglobalinternships.Exception.ResourceIsMissing;
import com.springboot.suntelglobalinternships.Model.User;
import com.springboot.suntelglobalinternships.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
//@RequestMapping("/SuntelGlobal")
public class UserController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    // Get ALL Users
    @GetMapping("/admin/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    // Get User by giving Id
    @GetMapping("/admin/users/{id}")
    public User getUserbyId(@PathVariable UUID id){
        User user=userRepository.findById(id)
                .orElseThrow(()->new ResourceIsMissing("User is not There !"));
        return user;
    }

    // Create User or SignUP
    @PostMapping("/signUp")
    public User createUser(@RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword())); // Here , WE are not storing the actual password , rather we are storing a crypted one !
        return userRepository.save(user);
    }

    // Update User
    @PutMapping("admin/users/{id}")
    public User updateUser(@PathVariable UUID id,@RequestBody User updatingUser){
            User user=userRepository.findById(id)
                    .orElseThrow(()->new ResourceIsMissing("User is not There !"));
           user.setFirstName(updatingUser.getFirstName());
           user.setLastName(updatingUser.getLastName());
           user.setEmail(updatingUser.getEmail());
           user.setAddress(updatingUser.getAddress());
           user.setPhone(updatingUser.getPhone());
           user.setRole(updatingUser.getRole());
           User updatedUser=userRepository.save(user);
           return user;
    }
    // Delete User
    @DeleteMapping("/admin/users/{id}")
    public User deleteUser(@PathVariable UUID id){
        User user=userRepository.findById(id)
                .orElseThrow(()->new ResourceIsMissing("User is not There !"));
        userRepository.delete(user);
        return user;
    }
    @GetMapping("/about")
    public String getAbout(){
        return "This project is going ahead!";
    }


}
