package com.example.AOP.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Response {

    @ExceptionHandler
    public ResponseEntity<ResponceJson> notFoundError(NotFound notFound){
        ResponceJson responceJson=new ResponceJson();
        responceJson.setName(notFound.getMessage());

        return new ResponseEntity<>(responceJson, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ResponceJson> BadRequest(RuntimeException notFound){
        ResponceJson responceJson=new ResponceJson();
        responceJson.setName(notFound.getMessage());

        return new ResponseEntity<>(responceJson, HttpStatus.BAD_REQUEST);
    }
}
