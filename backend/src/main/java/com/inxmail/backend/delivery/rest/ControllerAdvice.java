package com.inxmail.backend.delivery.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.inxmail.backend.domain.model.exceptions.TodoNotFoundException;


@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler( TodoNotFoundException.class )
    public ResponseEntity<String> resourceNotFoundException( TodoNotFoundException exception ) {
        return new ResponseEntity<>( exception.getMessage(), HttpStatus.NOT_FOUND );
    }

}
