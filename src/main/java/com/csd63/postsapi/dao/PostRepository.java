package com.csd63.postsapi.dao;

import com.csd63.postsapi.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post,Integer> {
}
