package com.greenfoxacademy.diworkshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class RedColor implements MyColor {
  Printer printer;

//  @Autowired
  @Override
  public void printColor() {
    printer.log("It appears to be red in color...");


  }
}
