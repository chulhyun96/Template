package com.example.demo.post.service;

import com.example.demo.post.dto.request.PostCreateRequest;
import com.example.demo.post.dto.response.PostCreateResponse;
import com.example.demo.post.dto.response.PostResponse;
import com.example.demo.post.entity.Post;
import com.example.demo.post.exception.PostException;
import com.example.demo.post.repository.PostRepository;
import com.example.demo.post.type.PostErrorStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository repository;

    public PostCreateResponse save(PostCreateRequest request, LocalDateTime now) {
        Post savedPost = repository.save(Post.from(request, now));
        return PostCreateResponse.from(savedPost);
    }

    public PostResponse getById(Long id) {
        Post findedPost = repository.findById(id)
                .orElseThrow(() -> new PostException(PostErrorStatus.NOT_FOUND));
        return PostResponse.from(findedPost);
    }

    public List<PostResponse> getAll() {
        return repository.findAll().stream()
                .map(PostResponse::from)
                .toList();
    }
}
