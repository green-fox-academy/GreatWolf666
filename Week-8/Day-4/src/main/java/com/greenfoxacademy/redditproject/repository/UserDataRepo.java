package com.greenfoxacademy.redditproject.repository;

import com.greenfoxacademy.redditproject.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDataRepo extends CrudRepository<User, Long> {
}
