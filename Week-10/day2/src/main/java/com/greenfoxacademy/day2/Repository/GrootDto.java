package com.greenfoxacademy.day2.Repository;

public class GrootDto {

  public String received;
  public String translated;


  public GrootDto(String received){
    this.received = received;
    this.translated = "I am Groot!";

  }

  public GrootDto(){
    this.translated = "I am Groot!";
  }
}
