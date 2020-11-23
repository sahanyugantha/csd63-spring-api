package com.csd63.postsapi;

import com.csd63.postsapi.dao.PostRepository;
import com.csd63.postsapi.model.Post;
import com.csd63.postsapi.service.PostService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
public class PostTest {

    //Arrange
    @Autowired
    private PostService postService;
    private int expected = 2;

    @Test
    public void getPostsTest(){
        //Act
        List<Post> postList= postService.getAll();
        int actual = postList.size();

        //Assert
        Assertions.assertEquals(expected, actual);
    }

}
