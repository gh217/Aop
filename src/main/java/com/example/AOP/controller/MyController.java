package com.example.AOP.controller;

import com.example.AOP.exception.NotFound;
import com.example.AOP.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/hello")
    public Object hello() {
        try {
            return myService.doSomething();
        }catch (Exception exception){
            throw new NotFound("Not exist");
        }


    }
}