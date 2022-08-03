package tech.sushnag22.blogrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import tech.sushnag22.blogrestapi.model.Comment;
import tech.sushnag22.blogrestapi.service.CommentService;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/posts/{postid}/comments")
    private List<Comment> getAllComments(@PathVariable("postid") int postid, Pageable page){
        return commentService.getAllCommentsByPostId(postid,page);
    }

    @PostMapping("/posts/{postid}/comments")
    private Comment saveComment(@RequestBody Comment comment, @PathVariable("postid") int postid){
        commentService.save(comment,postid);
        return comment;
    }
}
