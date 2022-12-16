package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoList {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application !" ;
    }
}
