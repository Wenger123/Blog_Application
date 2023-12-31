package com.example.demo.repositories;

import com.example.demo.models.entities.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    Page<Post> findAllByUserEntityUserId(Long userId, Pageable pageable);

    Optional<Post> findPostByPostIdAndUserEntityUserId(Long postId, Long userId);
}
