package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
    @GetMapping("/get")
    public void getTest(){
        System.out.println("hah");
    }
}
