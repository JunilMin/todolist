package com.todolist.todo.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private String description;
  private boolean completed;

}
