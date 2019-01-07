package com.greenfoxacademy.week10.Controller;

import com.greenfoxacademy.week10.Model.JsonObject;
import com.greenfoxacademy.week10.Service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/greeter")
  public Object greeter(@RequestParam(name = "name", required = false) String name,
                          @RequestParam(name = "title", required = false) String title){
      return methodService.getGreeter(name, title);
    }
    @GetMapping("/appenda/{appendable}")
  public Object appendA (@PathVariable String appendable){
      return methodService.addA(appendable);
    }

    @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable String action,
                        @RequestBody JsonObject until){
      return methodService.doUntil(action, until.getUntil());
    }
}

