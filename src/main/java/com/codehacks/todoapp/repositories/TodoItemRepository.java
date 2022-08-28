package com.codehacks.todoapp.repositories;

import com.codehacks.todoapp.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}
