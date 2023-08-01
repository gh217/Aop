package com.example.AOP.aspect;
/*
    execution in pointcut to declare the fun void fun()
    no point cut in before after..
 */
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.hibernate.annotations.CurrentTimestamp;
import org.springframework.stereotype.Component;

import java.io.FilterOutputStream;
import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class MyAspect {


//    // after no retutn
//    @After(" com.example.AOP.aspect.MainAspect.doSomething1())")
//    public void afterMethod(JoinPoint joinPoint) {
//        log.info("after");
//    }
//
//    @Before(" com.example.AOP.aspect.MainAspect.doSomething1())")
//    public void beforeMethod(JoinPoint joinPoint) {
//        log.info("before");
//    }

//    @AfterThrowing(
//            pointcut = "execution ( * com.example.AOP.service.MyService.doSomething(..))",
//            throwing = "theExe")
//    public void afterMethod11(JoinPoint joinPoint , Throwable theExe) {
//        // the exception
//        log.info("after throw "+theExe.getMessage());
//
//        // fun throw
//        log.info(" -->"+joinPoint.getSignature().toShortString());
//    }

//    //However, you cannot change the result directly within the
//    @AfterReturning(
//            pointcut = "execution ( * com.example.AOP.service.MyService.doSomething(..))",
//            returning = "result")
//    public String afterMethod1(JoinPoint joinPoint , String result) {
//        log.info("AfterReturning "+result);
//        return result;
//    }

    @Around("com.example.AOP.aspect.MainAspect.doSomething1()")
    public String around(ProceedingJoinPoint joinPoint) throws Throwable {

        try {
            String result = (String) joinPoint.proceed();
            return "mo";
        }catch (Throwable throwable){
            return "not";
        }


    }

}