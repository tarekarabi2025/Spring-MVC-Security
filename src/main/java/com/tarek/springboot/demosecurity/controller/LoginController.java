package com.tarek.springboot.demosecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showLoginForm(){
        return "fancy-login";
    }


    // add request mapping for /access-denied
    @GetMapping("/access-denied")
    public String showAccessDeniedPage(){
        return "access-denied";
    }
}
