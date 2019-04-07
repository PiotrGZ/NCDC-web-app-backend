package com.piotrgz.ncdcbackend.books;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class EntityAlreadyExistsException extends IllegalArgumentException {

    public EntityAlreadyExistsException(String message) {
        super(message);
    }
}
