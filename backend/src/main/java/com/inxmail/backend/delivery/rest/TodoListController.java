package com.inxmail.backend.delivery.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inxmail.backend.domain.model.TodoListDTO;
import com.inxmail.backend.domain.model.TodoListService;


@RestController()
@RequestMapping( path = "lists" )
public class TodoListController {

    private final TodoListService todoListService;


    public TodoListController( TodoListService todoListService ) {
        this.todoListService = todoListService;
    }


    @GetMapping()
    public ResponseEntity<List<TodoListDTO>> getTodoLists() {
        List<TodoListDTO> tls = todoListService.getTodoLists()
                .stream()
                .map( TodoListDTO::konvertiere )
                .collect( Collectors.toList() );

        return new ResponseEntity<>( tls, HttpStatus.OK );
    }

}
