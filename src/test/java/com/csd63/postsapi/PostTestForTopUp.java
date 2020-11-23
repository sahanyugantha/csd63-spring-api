package com.csd63.postsapi;

import com.csd63.postsapi.service.PostService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PostTestForTopUp {

    @Autowired
    private PostService postService;

    @Test
    public void testSum(){
      //  int actual = postService.getAll().size();

       // Assertions.assertEquals(5,actual);
    }
}
