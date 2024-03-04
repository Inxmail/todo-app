package com.inxmail.backend.domain.model;

public record TodoDTO(long id, String title, boolean completed) {
    public static TodoDTO convert( Todo todo ) {
        return new TodoDTO( todo.getId(), todo.getTitle(), todo.isCompleted() );
    }
}
