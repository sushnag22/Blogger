package tech.sushnag22.blogrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.sushnag22.blogrestapi.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
