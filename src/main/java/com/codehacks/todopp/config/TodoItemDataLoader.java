package com.codehacks.todopp.config;

import com.codehacks.todopp.models.TodoItem;
import com.codehacks.todopp.repositories.TodoItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoItemDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(TodoItem.class);

    @Autowired
    private TodoItemRepository todoItemRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
        if (todoItemRepository.count() == 0) {
            TodoItem item1 = new TodoItem("Get groceries");
            TodoItem item2 = new TodoItem("Do your homework");

            todoItemRepository.save(item1);
            todoItemRepository.save(item2);
        }
        logger.info("Number of TodoItems: {}", todoItemRepository.count());
    }
}
