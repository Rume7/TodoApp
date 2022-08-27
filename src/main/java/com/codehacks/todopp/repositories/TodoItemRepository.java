package com.codehacks.todopp.repositories;

import com.codehacks.todopp.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}
