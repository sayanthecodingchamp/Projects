package com.springboot.suntelglobalinternships.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceIsMissing extends RuntimeException{
    public ResourceIsMissing(String message) {
        super(message);
    }
}
