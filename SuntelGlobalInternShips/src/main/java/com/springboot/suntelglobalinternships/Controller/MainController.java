package com.springboot.suntelglobalinternships.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String getHomePage(){
        return "Welcome to the Suntel Global\n" +
                "Data Creating Value For Core Businesses Suntel Global is a one stop solutions for Mortgage, Medical Billing Solutions ,Title, Software development, Data Entry & Call Center services - All under one roof!";
    }
}
