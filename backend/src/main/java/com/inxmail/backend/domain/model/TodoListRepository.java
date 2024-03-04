package com.inxmail.backend.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoListRepository extends JpaRepository<TodoList, Long> {
}
