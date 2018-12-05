package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam() String name) {
    return new Greeting(atomicLong.incrementAndGet(),name);
  }


}

