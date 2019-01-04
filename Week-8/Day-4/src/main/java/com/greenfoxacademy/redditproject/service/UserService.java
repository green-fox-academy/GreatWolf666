package com.greenfoxacademy.redditproject.service;

import com.greenfoxacademy.redditproject.model.User;

import java.util.List;

public interface UserService {

  List<User> getUser();
  User getUser(long id);
  void addUser(User user);
  void editUser(User user);
  void deleteUser(long id);
  void loginUser(User user);
  void logoutUser(User user);
}
