package com.example.demo.repository;

import com.example.demo.model.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    @EntityGraph(attributePaths = {"user", "comments"})
    List<Post> findByComments_Post_Id(Long id);
}