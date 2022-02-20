package ru.netology.model;

import java.util.concurrent.atomic.AtomicLong;

public class Post {
  private AtomicLong id;
  private String content;

  public Post() {
  }

  public Post(AtomicLong id, String content) {
    this.id = id;
    this.content = content;
  }

  public AtomicLong getId() {
    return id;
  }

  public void setId(AtomicLong id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
