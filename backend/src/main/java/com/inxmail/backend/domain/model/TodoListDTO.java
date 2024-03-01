package com.inxmail.backend.domain.model;

import java.util.List;
import java.util.stream.Collectors;


public record TodoListDTO(long id, String name, boolean completed, List<TodoDTO> todos) {
    public static TodoListDTO konvertiere( TodoList todoList ) {
        return new TodoListDTO( todoList.getId(), todoList.getName(), todoList.isCompleted(),
                todoList.getTodos().stream().map( TodoDTO::convert ).collect( Collectors.toList() ) );
    }
}
