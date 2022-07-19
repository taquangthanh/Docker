package com.example.hello.controller;

import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String getName(){
        RestTemplate template = new RestTemplate();
        String url = "http://localhost:8080/name";
        String name = "Hello :"+ template.getForObject(url,String.class);
        return name ;
    }
}
