package com.example.AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MainAspect {
    @Pointcut("execution(* com.example.AOP.service.MyService.doSomething(..))")
    public void doSomething1(){}

}
