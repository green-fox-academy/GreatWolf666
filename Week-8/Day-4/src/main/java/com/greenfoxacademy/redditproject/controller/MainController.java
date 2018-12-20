package com.greenfoxacademy.redditproject.controller;

import com.greenfoxacademy.redditproject.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  PostServiceImpl service;
  @Autowired
  MainController(PostServiceImpl service){
    this.service = service;
  }

  @GetMapping("/")
  public String mainPage(Model model){
    model.addAttribute("posts", service.getPosts());
    return "index";
  }



}
