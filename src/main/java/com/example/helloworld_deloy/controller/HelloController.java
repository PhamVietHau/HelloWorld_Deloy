package com.example.helloworld_deloy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/v1")
public class HelloController {
    @GetMapping("/")
    public ResponseEntity<String> hello(){
        return  ResponseEntity.ok("Hello world");
    }
}
