package com.greatwolf.exampractice.controller;

import com.greatwolf.exampractice.model.URLalias;
import com.greatwolf.exampractice.service.UrlAliasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  UrlAliasServiceImpl urlAliasService;

  @GetMapping("/")
  public String mainPage(@RequestParam(value = "id", required = false) Long id, Model model){
    if (id != null){
      model.addAttribute("name", urlAliasService.findById(id).getAliasName());
      model.addAttribute("code", urlAliasService.findById(id).getSecretCode());
    } else {
      model.addAttribute("name", "empty");
      model.addAttribute("code", "empty");
    }
    model.addAttribute("newAlias", new URLalias());
    return "index";
  }


}
