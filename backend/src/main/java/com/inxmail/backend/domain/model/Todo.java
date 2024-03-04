package com.inxmail.backend.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Todo {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private long id;

    private String title;

    private boolean completed;

    @ManyToOne
    @JoinColumn( name = "todolist_id" )
    private TodoList todolist;


    public Todo() {
    }


    public Todo( String title, TodoList todoList ) {
        this.title = title;
        this.todolist = todoList;
    }


    public long getId() {
        return id;
    }


    public void setId( long id ) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle( String title ) {
        this.title = title;
    }


    public boolean isCompleted() {
        return completed;
    }


    public void setCompleted( boolean completed ) {
        this.completed = completed;
    }


    public TodoList getTodolist() {
        return todolist;
    }


    public void setTodolist( TodoList todoList ) {
        this.todolist = todoList;
    }
}
