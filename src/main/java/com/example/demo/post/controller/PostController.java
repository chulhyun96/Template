package com.example.demo.post.controller;

import com.example.demo.post.dto.request.PostCreateRequest;
import com.example.demo.post.dto.response.PostCreateResponse;
import com.example.demo.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/posts")
    public ResponseEntity<PostCreateResponse> createPost(@RequestBody @Validated PostCreateRequest request) {
        PostCreateResponse response = postService.save(request, LocalDateTime.now());
        return ResponseEntity.ok(response);
    }
}
