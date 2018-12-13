package com.greenfoxacademy.diworkshop;

import com.greenfoxacademy.diworkshop.services.Printer;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@SpringBootApplication
public class DiworkshopApplication {

  @Component
  public class CommandLineAppStartupRunner implements CommandLineRunner {
    private final Printer printer = new Printer();
    @Override
    public void run(String...args) throws Exception{
      printer.log("Doesn't work");
    }
  }

  @Autowired
  Printer printer;

  public static void main(String[] args) {
    SpringApplication.run(DiworkshopApplication.class, args);
  }

}

