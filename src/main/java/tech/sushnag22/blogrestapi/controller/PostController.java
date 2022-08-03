package tech.sushnag22.blogrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.sushnag22.blogrestapi.model.Post;
import tech.sushnag22.blogrestapi.service.PostService;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    // Returns all the posts
    @GetMapping("/posts")
    private List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    // Returns a post with a given id
    @GetMapping("/posts/{postid}")
    private Post getPost(@PathVariable("postid") int postid){
        return postService.getPostById(postid);
    }

    // Saves a post
    @PostMapping("/posts")
    private Post savePost(@RequestBody Post post){
        postService.save(post);
        return post;
    }

    // Updates a post with a given id
    @PutMapping("/posts/{postid}")
    private String updatePost(@RequestBody Post post,@PathVariable("postid") int postid){
        postService.update(post,postid);
        return "Post with id "+postid+" updated";
    }

}
