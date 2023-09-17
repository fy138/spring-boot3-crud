package com.example.demo.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class handlerError {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<errorEntiry> handlerError(Exception e) {
        errorEntiry err = new errorEntiry();
        err.setCode(409);
        err.setMsg(e.getMessage());
        return ResponseEntity.ok(err);
    }
}
