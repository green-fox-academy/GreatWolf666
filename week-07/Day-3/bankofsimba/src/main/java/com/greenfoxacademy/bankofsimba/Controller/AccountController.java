package com.greenfoxacademy.bankofsimba.Controller;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AccountController {


  @RequestMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("show", show);
    return "index";
  }
}
