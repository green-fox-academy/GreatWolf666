package com.greenfoxacademy.redditproject.model;

import java.util.Date;
import javax.persistence.*;


@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long user_id;
  private String title;
  private String content;
  private String url;
  private long postId;
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

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}

