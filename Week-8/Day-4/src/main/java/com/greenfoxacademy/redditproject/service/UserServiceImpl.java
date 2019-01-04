package com.greenfoxacademy.redditproject.service;


import com.greenfoxacademy.redditproject.model.User;
import com.greenfoxacademy.redditproject.repository.UserDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  private UserDataRepo repository;

  @Autowired
  UserServiceImpl(UserDataRepo repository){
    this.repository = repository;
  }

  @Override
  public List<User> getUser() {
    List<User> users = new ArrayList<>();
    repository.findAll().forEach(users::add);
    return users;
  }

  @Override
  public User getUser(long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void addUser(User user) {
    repository.save(user);

  }

  @Override
  public void editUser(User user) {
    repository.save(user);
  }

  @Override
  public void deleteUser(long id) {
    repository.deleteById(id);
  }

  @Override
  public void loginUser(User user) {

  }

  @Override
  public void logoutUser(User user) {

  }
}
