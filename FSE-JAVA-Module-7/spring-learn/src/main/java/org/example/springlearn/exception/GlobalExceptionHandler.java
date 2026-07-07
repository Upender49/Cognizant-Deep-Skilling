package org.example.springlearn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.*;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException ex){
        Map<String,Object> body = new HashMap<>();
        body.put("timestamp", new Date());
        body.put("status", HttpStatus.BAD_REQUEST.value());
        List<String> errors = new ArrayList<>();
        ex.getBindingResult()
                .getFieldErrors()
                .forEach(error -> errors.add(error.getDefaultMessage()));
        body.put("errors", errors);
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
}
