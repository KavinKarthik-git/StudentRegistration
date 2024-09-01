package com.kavin.hello.kavin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class Notexist extends RuntimeException {
    public Notexist(String message)
    {
        super(message);
    }

}
