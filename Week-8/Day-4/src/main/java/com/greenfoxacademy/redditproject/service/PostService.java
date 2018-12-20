package com.greenfoxacademy.redditproject.service;

import com.greenfoxacademy.redditproject.model.Post;

import java.util.List;

public interface PostService {

  List<Post> getPosts();
  Post getPostById(long id);
  void addPost(Post post);
  void editPost(Post post);
  void deletePostById(long id);
}
