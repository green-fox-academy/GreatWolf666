package com.greatwolf.exampractice.controller;

import com.greatwolf.exampractice.model.URLalias;
import com.greatwolf.exampractice.service.UrlAliasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  @Autowired
  UrlAliasServiceImpl urlAliasService;

  @GetMapping("/")
  public String mainPage(@RequestParam(value = "id", required = false) Long id, Model model) {
    if (id != null) {
      model.addAttribute("name", urlAliasService.findById(id).getAliasName());
      model.addAttribute("code", urlAliasService.findById(id).getSecretCode());
    } else {
      model.addAttribute("name", "empty");
      model.addAttribute("code", "empty");
    }
    model.addAttribute("newAlias", new URLalias());
    return "index";
  }

  @PostMapping("/save-link")
  public String saveLink(@ModelAttribute("newAlias") URLalias urlAlias, Model model, RedirectAttributes redir) {
    if (urlAliasService.existsAliasByAliasName(urlAlias.getAliasName())) {
      model.addAttribute("error", "Alias already taken!");
      return "index";
    } else {
      urlAliasService.addAlias(urlAlias);
      redir.addAttribute("id", urlAliasService.findAliasByName(urlAlias.getAliasName()).getId());
      return "redirect:/?id={id}";
    }
  }

  @GetMapping("/a/{alias}")
  public Object getRequestedAlias(@PathVariable String urlAlias) {
    if (urlAliasService.findAliasByName(urlAlias) != null) {
      urlAliasService.incHitCount(urlAlias);
      String url = urlAliasService.findAliasByName(urlAlias).getUrl();
      return "redirect:" + url;
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }
}
