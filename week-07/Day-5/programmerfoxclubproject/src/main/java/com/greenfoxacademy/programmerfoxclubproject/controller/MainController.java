package com.greenfoxacademy.programmerfoxclubproject.controller;

import com.greenfoxacademy.programmerfoxclubproject.service.Fox;
import com.greenfoxacademy.programmerfoxclubproject.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  FoxService foxService;

  @GetMapping("/")
  public String index(Model model, @RequestParam(value = "name", required = false) String petname ){
    if (petname == null){
      return "redirect:/login";
    }
    Fox fox = foxService.getFoxByName(petname);
    model.addAttribute("fox", new Fox());
    return "login";
  }
}
