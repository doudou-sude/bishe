package com.hsh.hsh.exception;


import com.hsh.hsh.respond.Res;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtrlExceptionHandler {
    
    @ExceptionHandler(Exception.class)
    public Res handleException(Exception e) {
        return Res.error(e.getMessage());
    }

}
