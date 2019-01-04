package com.greenfoxacademy.redditproject.controller;

import com.greenfoxacademy.redditproject.model.Post;
import com.greenfoxacademy.redditproject.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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
  @PostMapping(value = "/newpost", consumes = "application/x-www-form-urlencoded")
  public String submitPage(@Valid Post post){
    service.addPost(post);
    return "redirect:/";
  }

  @GetMapping(value = "/addnewpost")
  public String postForm(Model model, Post post){
    model.addAttribute("post", post);
    return "newpost";
  }

  @GetMapping("/post/{postId}")
  public String showPost(Model model, @PathVariable String postId){
    model.addAttribute("post", service.getPostById(Integer.parseInt(postId)));
    return "post";
  }
  @GetMapping("/post/{postId}/delete")
  public String deletePost(@PathVariable String postId){
    service.deletePostById(Integer.parseInt(postId));
    return "redirect:/";
  }
}
