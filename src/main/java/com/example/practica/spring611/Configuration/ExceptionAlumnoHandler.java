package com.example.practica.spring611.Configuration;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionAlumnoHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(noExisteException.class)
    protected ResponseEntity<Object> handleNotFound(Exception ex, WebRequest request){
        return handleExceptionInternal(ex,"No existe este alumno",new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
