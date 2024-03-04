package com.inxmail.backend.domain.model;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoListService {

    private final TodoListRepository todoListRepository;


    public TodoListService( TodoListRepository todoListRepository ) {
        this.todoListRepository = todoListRepository;
    }


    public List<TodoList> getTodoLists() {
        return todoListRepository.findAll();
    }

}
