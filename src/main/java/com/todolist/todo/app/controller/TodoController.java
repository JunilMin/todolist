package com.todolist.todo.app.controller;

import com.todolist.todo.app.model.Todo;
import com.todolist.todo.app.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

  @Autowired
  private TodoService todoService;

  @GetMapping
  public List<Todo> getAllTodos() {
    return todoService.getAllTodos();
  }

  @PostMapping
  public Todo createTodo(@RequestBody Todo todo) {
    return todoService.createTodo(todo);
  }

  @PutMapping("/{id}")
  public Todo updateTodoStatus(@PathVariable Long id, @RequestParam boolean completed) {
    return todoService.updateTodoStatus(id, completed);
  }

  @DeleteMapping("/{id}")
  public void deleteTodoById(@PathVariable Long id) {
    todoService.deleteTodoById(id);
  }
}
