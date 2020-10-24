package com.csd63.postsapi.service;

import com.csd63.postsapi.dao.PostRepository;
import com.csd63.postsapi.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAll(){
        return postRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public Post getById(int id){
        Optional<Post> optionalPost = postRepository.findById(id);
        return optionalPost.get();
    }

    public int add(Post post){
        if(post != null){
            postRepository.save(post);
            return 1;
        }

        return -1;
    }

    public int update(Post post){
        if(post != null){
            if(postRepository.findById(post.getId()).isPresent()) {
                postRepository.save(post);
                return 1;
            } else {
                return 0;
            }
        }
        return -1;
    }

    public int deleteById(int id){
        if(postRepository.findById(id).isPresent()){
            postRepository.deleteById(id);
            return 1;
        }

        return -1;
    }
}
