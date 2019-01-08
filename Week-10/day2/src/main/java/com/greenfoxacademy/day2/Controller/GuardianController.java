package com.greenfoxacademy.day2.Controller;


import com.greenfoxacademy.day2.Repository.GrootDto;
import com.greenfoxacademy.day2.Service.GrootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  GrootService grootService;

  @Autowired
  public GuardianController(GrootService grootService){
    this.grootService = grootService;
  }

  @GetMapping("/groot")
  public ResponseEntity<GrootDto>grootMethod(@RequestParam(name = "message") String message){
    return message.isEmpty()
        ? new ResponseEntity<>(
            new GrootDto(),
        HttpStatus.BAD_REQUEST)
        : new ResponseEntity<>(
            new GrootDto(message),
        HttpStatus.OK
    );
  }
}
