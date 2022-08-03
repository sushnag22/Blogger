package tech.sushnag22.blogrestapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.sushnag22.blogrestapi.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    Page<Comment> findByPostId(int postId, Pageable pageable);
}
