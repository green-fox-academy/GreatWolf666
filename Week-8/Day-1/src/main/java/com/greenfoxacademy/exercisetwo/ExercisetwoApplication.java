package com.greenfoxacademy.exercisetwo;

import com.greenfoxacademy.exercisetwo.Model.Todo;
import com.greenfoxacademy.exercisetwo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisetwoApplication implements CommandLineRunner {
  @Autowired
  TodoRepository repository;
  public static void main(String[] args) {
    SpringApplication.run(ExercisetwoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // repository.save(new Todo("hello"));
  }
}

