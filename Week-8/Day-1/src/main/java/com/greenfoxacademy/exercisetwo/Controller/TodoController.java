package com.greenfoxacademy.exercisetwo.Controller;

import com.greenfoxacademy.exercisetwo.Model.Todo;
import com.greenfoxacademy.exercisetwo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService service;

  @Autowired
  public TodoController(TodoService service) {
    this.service = service;

  }

  @GetMapping(value = {"/", "/list"})

  public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("todos", service.getActive());
    } else {
      model.addAttribute("todos", service.getAllTodos());
    }
    return "todoList";
  }

  @GetMapping(value = "/add")
  public String add(Model model) {
    model.addAttribute("todo", new Todo());
    return "new";
  }

  @PostMapping(value = "/add")
  public String add(@ModelAttribute Todo todo) {
    service.addTodo(todo);

    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/delete")
  public String delete(@PathVariable long id) {
    service.delete(id);
    return "redirect:/todo/";

  }

}

