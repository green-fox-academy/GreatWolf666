package com.greenfoxacademy.week10.Model;

public class Greeter {

  private String welcome_message;
  private String name;
  private String title;

  public Greeter(String name, String title){
    this.name = name;
    this.title = title;
    this.welcome_message = "Oh, hi there " + name + ", my dear "+ title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
