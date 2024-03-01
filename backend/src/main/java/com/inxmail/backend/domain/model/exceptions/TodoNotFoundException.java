package com.inxmail.backend.domain.model.exceptions;

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException() {
        super();
    }


    public TodoNotFoundException( long id ) {
        super( "Could not find todo with id: " + id );
    }
}
