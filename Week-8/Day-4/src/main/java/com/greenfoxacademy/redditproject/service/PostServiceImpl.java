package com.greenfoxacademy.redditproject.service;

import com.greenfoxacademy.redditproject.model.Post;
import com.greenfoxacademy.redditproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  private PostRepository repository;

  @Autowired
  PostServiceImpl(PostRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Post> getPosts() {
    List<Post> posts = new ArrayList<>();
    repository.findAll().forEach(posts::add);
    return posts;
  }

  @Override
  public Post getPostById(long id) {
    return repository.findById(id).orElse(null);
  }

  public void addPost(Post post) {
    post.setDate(new Date());
    repository.save(post);
  }

  @Override
  public void editPost(Post post) {
    repository.save(post);
  }

  @Override
  public void deletePostById(long id) {
    repository.deleteById(id);
  }


}
