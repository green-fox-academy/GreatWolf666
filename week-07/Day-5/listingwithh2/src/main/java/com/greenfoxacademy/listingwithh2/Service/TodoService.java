package com.greenfoxacademy.listingwithh2.Service;

import com.greenfoxacademy.listingwithh2.Model.Todo;
import com.greenfoxacademy.listingwithh2.Repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

  TodoRepository todoRepository;

  public TodoService(){
    this.todoRepository = todoRepository;


  }
  public void addTodo(Todo todo){
    if (todo != null){
      todoRepository.save(todo);
    }
  }
  public List<Todo> getTodoList(){
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todoList:: add);
    return todoList;
  }
}
