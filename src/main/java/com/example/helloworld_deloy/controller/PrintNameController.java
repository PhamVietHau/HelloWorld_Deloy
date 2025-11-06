package com.example.helloworld_deloy.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("print/v1")
public class PrintNameController {
    @GetMapping("nameage")
    public ResponseEntity<String> printName(@RequestParam String name, String age) {
        return ResponseEntity.ok("Name: "+ name+ " age: "+ age);
    }
    @GetMapping("plus")
    public ResponseEntity<String> plus(@RequestParam Integer a, Integer b) {
        return ResponseEntity.ok("a + b = "+ (a+b));
    }
}
