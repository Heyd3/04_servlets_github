package ru.netology.repository;

import ru.netology.model.Post;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

// Stub
public class PostRepository {

  public Map<AtomicLong, Post> posts = new ConcurrentHashMap<AtomicLong, Post>();
  private AtomicLong id = new AtomicLong();

  public List<Post> all() {
    return new ArrayList<>(posts.values());
  }

  public Optional<Post> getById(long id) {

    return Optional.ofNullable(posts.get(id));
  }

  public Post save(Post post) {

    if (post.getId() == 0){
      Post newPost = new Post(id, post.getContent());
      posts.put(id, newPost);
      id.getAndIncrement();
      return newPost;
    }
    var entity = posts.get(post.getId());

    entity.setContent(post.getContent());

    return entity;
  }

  public void removeById(long id) {
    posts.remove(id);
  }
}
