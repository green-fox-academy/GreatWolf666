package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController  {

  AtomicLong loadcounter = new AtomicLong(0);

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name") String name){
    model.addAttribute("name", name);
    model.addAttribute("loadcounter", loadcounter.incrementAndGet());
    return "greeting";
  }

}
