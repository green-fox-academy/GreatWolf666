package com.greenfoxacademy.week10.Controller;

import com.greenfoxacademy.week10.Service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONController {

  private MethodService methodService;

    @Autowired
  public JSONController(MethodService methodService){
      this.methodService = methodService;
    }

    @GetMapping("/doubling")
    public Object doubling (@RequestParam(value = "input") Integer inputNumber){
      return methodService.getDouble(inputNumber);
    }

}

