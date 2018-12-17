package com.greenfoxacademy.listingwithh2.Repository;

import com.greenfoxacademy.listingwithh2.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long > {
}
