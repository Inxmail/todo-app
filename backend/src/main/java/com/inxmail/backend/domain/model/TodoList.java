package com.inxmail.backend.domain.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class TodoList {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private long id;

    private String name;

    private boolean completed;

    @OneToMany( mappedBy = "todolist", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    private List<Todo> todos = new ArrayList<>();


    public TodoList() {
    }


    public TodoList( String name ) {
        this.name = name;
    }


    public long getId() {
        return id;
    }


    public void setId( long id ) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName( String name ) {
        this.name = name;
    }


    public List<Todo> getTodos() {
        return todos;
    }


    public void setTodos( List<Todo> todos ) {
        this.todos = todos;
    }


    public boolean isCompleted() {
        return completed;
    }


    public void setCompleted( boolean completed ) {
        this.completed = completed;
    }
}
