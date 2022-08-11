package com.srinid.javaspringbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Java spring boot world with container";
    }
}
