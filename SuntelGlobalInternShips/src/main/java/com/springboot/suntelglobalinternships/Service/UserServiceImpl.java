//package com.springboot.suntelglobalinternships.Service;
//
//import com.springboot.suntelglobalinternships.Model.Role;
//import com.springboot.suntelglobalinternships.Model.User;
//import com.springboot.suntelglobalinternships.Repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserService{
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Override
//    public User createFirstUser() {
//        Role role=new Role("ROLE_ADMIN");
//        User user1=new User("Sayan","Ghosh","sayan@gmail.com","sayan","6789098765","Kolkata",role);
//        user1.setPassword(passwordEncoder.encode(user1.getPassword()));
//        System.out.println("PASSWORD-"+user1.getPassword());
//        System.out.println("OBJECT CREATED");
//        userRepository.save(user1);
//        return user1;
//    }
//}
