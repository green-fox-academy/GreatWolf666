package com.greenfoxacademy.exercisetwo.Repository;

import com.greenfoxacademy.exercisetwo.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long > {
}


