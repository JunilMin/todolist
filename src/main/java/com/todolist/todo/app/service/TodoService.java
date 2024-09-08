package com.todolist.todo.app.service;

import com.todolist.todo.app.model.Todo;
import com.todolist.todo.app.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

  @Autowired
  private TodoRepository todoRepository;

  public List<Todo> getAllTodos() {
    return todoRepository.findAll();
  }

  public Todo createTodo(Todo todo) {
    return todoRepository.save(todo);
  }

  public void deleteTodoById(Long id) {
    todoRepository.deleteById(id);
  }

  public Todo updateTodoStatus(Long id, boolean completed) {
    Todo todo = todoRepository.findById(id).orElseThrow();
    todo.setCompleted(completed);
    return todoRepository.save(todo);
  }
}
