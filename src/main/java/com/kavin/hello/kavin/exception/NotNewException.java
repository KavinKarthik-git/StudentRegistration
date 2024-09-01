package com.kavin.hello.kavin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class NotNewException extends RuntimeException{
    public NotNewException(String message)
    {
        super(message);
    }

}
