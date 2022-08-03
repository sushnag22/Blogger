package tech.sushnag22.blogrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import tech.sushnag22.blogrestapi.model.Comment;
import tech.sushnag22.blogrestapi.model.Post;
import tech.sushnag22.blogrestapi.repository.CommentRepository;
import tech.sushnag22.blogrestapi.repository.PostRepository;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostService postService;

    public List<Comment> getAllCommentsByPostId(int postid, Pageable page){
        return commentRepository.findByPostId(postid, page).getContent();
    }
    public void save(Comment comment,int postid){
        Post p = postService.getPostById(postid);
        comment.setPost(p);
        commentRepository.save(comment);
    }
}