package tech.sushnag22.blogrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.sushnag22.blogrestapi.model.Post;
import tech.sushnag22.blogrestapi.repository.PostRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return new ArrayList<Post>(postRepository.findAll());
    }

    public Post getPostById(int id) {
        return postRepository.findById(id).get();
    }

    public void save(Post post){
        postRepository.save(post);
    }
    public void delete(int id){
        postRepository.deleteById(id);
    }
    public void update(Post post,int id){
        Post p = getPostById(id);
        p.setTitle(post.getTitle());
        p.setContent(post.getContent());
        postRepository.save(p);
    }
}
