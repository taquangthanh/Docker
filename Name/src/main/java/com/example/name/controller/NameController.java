package com.example.name.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/name")
    public String getName(){
        return "Ta Quang Thanh";
    }
}
