package tech.sushnag22.blogrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.sushnag22.blogrestapi.model.Post;
import tech.sushnag22.blogrestapi.service.PostService;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    //Return all the posts
    @GetMapping("/posts")
    private List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
}
