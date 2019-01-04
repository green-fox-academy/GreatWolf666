package com.greenfoxacademy.redditproject.model;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Null;


@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long postId;

  private String title;

  private String content;
  
  private long user_id;

  private int vote;


  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  public Post() {

  }

  public long getPostId() {
    return postId;
  }

  public void setPostId(long postId) {
    this.postId = postId;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
  public String getContent(){
    return content;
  }
  public void setContent(String content){
    this.content = content;
  }
  public void setUser_id(long user_id){
    this.user_id = user_id;
  }
  public long getUser_id(){
    return user_id;
  }
}

