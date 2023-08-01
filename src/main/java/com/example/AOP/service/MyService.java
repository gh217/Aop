package com.example.AOP.service;

import com.example.AOP.exception.BadRequest;
import com.example.AOP.exception.NotFound;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String doSomething() throws InterruptedException {
        if(1==1)throw new NotFound("error");
       return "oo";
    }

}