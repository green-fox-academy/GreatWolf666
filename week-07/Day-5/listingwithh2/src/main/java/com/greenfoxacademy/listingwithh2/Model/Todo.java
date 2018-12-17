package com.greenfoxacademy.listingwithh2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public void Todo(long id, String title){
    this.id = id;
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }
}
