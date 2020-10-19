package com.csd63.postsapi.controller;

import com.csd63.postsapi.model.Post;
import com.csd63.postsapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public Iterable<Post> getAllPosts(){
        return postService.getAll();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") int id){
        return postService.getById(id);
    }

    @PostMapping
    public int addPost(@RequestBody Post post){
        return postService.add(post);
    }

    @PutMapping
    public int updatePost(@RequestBody Post post){
        return postService.update(post);
    }

    @DeleteMapping("/{id}")
    public int deletePost(@PathVariable("id") int id){
        return postService.deleteById(id);
    }
}
