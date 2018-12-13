package com.greenfoxacademy.diworkshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {
  Printer printer;

  @Autowired
  @Override
  public void printColor() {
    printer.log("It appears to be green in color...");
  }
}
