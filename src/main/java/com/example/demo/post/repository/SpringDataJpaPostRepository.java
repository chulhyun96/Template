package com.example.demo.post.repository;

import com.example.demo.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaPostRepository extends JpaRepository<Post, Long> {
}
