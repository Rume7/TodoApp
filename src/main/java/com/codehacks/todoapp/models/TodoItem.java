package com.codehacks.todoapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Entity
@Table(name = "todo_item")
@Setter
@Getter
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Description is required")
    private String description;

    private boolean complete;

    private Instant createdDate;

    private Instant modifiedDate;

    public TodoItem() {}

    public TodoItem(String description) {
        this.description = description;
        this.complete = false;
        this.createdDate = Instant.now();
        this.modifiedDate = Instant.now();
    }

    @Override
    public String toString() {
        return String.format("TodoItem{id=%d, description='%s', complete='%s', " +
                        "createdDate='%s', modifiedDate='%s'}", getId(), getDescription(),
                isComplete(), getCreatedDate().toString().substring(0, 11), getModifiedDate().toString().substring(0, 10));
    }
}
