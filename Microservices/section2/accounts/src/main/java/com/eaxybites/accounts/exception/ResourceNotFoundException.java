package com.eaxybites.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resourceName, String fieldData, String fieldValue) {
        super(String.format("%s not found with the given %s : '%s'", resourceName, fieldData, fieldValue));
    }
}
