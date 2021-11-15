package com.app.gsw.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gsw/v1")
public class WelcomeController {

    @GetMapping("welcome")
    public String getWelcomeMessage(){
        return "Hello User!!";
    }
}