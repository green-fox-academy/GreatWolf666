package com.greenfoxacademy.listingwithh2.Controller;


import com.greenfoxacademy.listingwithh2.Repository.TodoRepository;
import com.greenfoxacademy.listingwithh2.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {


  TodoService service;


  @Autowired
  public TodoController(TodoService service){
    this.service = service;

  }

  @GetMapping(value = {"/", "/list"})
  @ResponseBody
  public String list(Model model){
    model.addAttribute("todos", service);
    return "todolist";
  }

}
