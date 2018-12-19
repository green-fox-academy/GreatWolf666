package com.greenfoxacademy.exercisetwo.Service;

import com.greenfoxacademy.exercisetwo.Model.Todo;
import com.greenfoxacademy.exercisetwo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

  List<Todo> list;

  TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository){
    this.todoRepository = todoRepository;


  }
  public List<Todo> getAllTodos(){
    this.list = new ArrayList<>();
    todoRepository.findAll().forEach(list::add);
    return list;
  }

  public List<Todo> getActive(){
    this.list = getAllTodos()
        .stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList());
    return list;
  }


  public void addTodo(Todo todo){
    if (todo != null){
      todoRepository.save(todo);
    }
  }
  public void delete(long id){
    todoRepository.deleteById(id);
  }

  public List<Todo> getTodoList(){
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todoList:: add);
    return todoList;
  }
  public Todo getTodo(long id){
    return todoRepository.findById(id).get();
  }

  public void editTodoList(long id, String newTitle, boolean urgent, boolean done){
    if (newTitle != null){
      getTodo(id).setTitle(newTitle);
      getTodo(id).setUrgent(urgent);
      getTodo(id).setDone(done);
      todoRepository.save(getTodo(id));
    }
  }

}
