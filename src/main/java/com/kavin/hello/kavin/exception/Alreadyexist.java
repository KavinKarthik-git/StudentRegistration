package com.kavin.hello.kavin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED)
public class Alreadyexist extends RuntimeException{

    public Alreadyexist(String message)
    {
        super(message);
    }

}
