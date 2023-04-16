package com.omega.springboot.merry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String printHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String printWorkout(){
        return "Run 21k";
    }
}
