package com.security.learn.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/security")
    public String getMessage(){
        return "welcome to security 33 ";
    }
}
