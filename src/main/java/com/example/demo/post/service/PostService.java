package com.example.demo.post.service;

import com.example.demo.post.dto.request.PostCreateRequest;
import com.example.demo.post.dto.response.PostCreateResponse;
import com.example.demo.post.entity.Post;
import com.example.demo.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository repository;

    public PostCreateResponse save(PostCreateRequest request, LocalDateTime now) {
        Post savedPost = repository.save(Post.from(request, now));
        return savedPost.toModel();
    }
}
