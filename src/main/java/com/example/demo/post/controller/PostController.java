package com.example.demo.post.controller;

import com.example.demo.post.dto.request.PostCreateRequest;
import com.example.demo.post.dto.response.PostCreateResponse;
import com.example.demo.post.dto.response.PostResponse;
import com.example.demo.post.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "게시글 등록 및 조회 API 명세서")
public class PostController {
    private final PostService postService;

    @Operation(description = "게시글 생성 API")
    @PostMapping("/posts")
    public ResponseEntity<PostCreateResponse> createPost(@RequestBody @Validated PostCreateRequest request) {
        PostCreateResponse response = postService.save(request, LocalDateTime.now());
        return ResponseEntity.ok(response);
    }

    @Operation(description = "게시글 단건 조회 API")
    @GetMapping("/posts/{id}")
    public ResponseEntity<PostResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(postService.getById(id));
    }

    @Operation(description = "게시글 전체 조회 API")
    @GetMapping("/posts")
    public ResponseEntity<List<PostResponse>> getAll() {
        List<PostResponse> all = postService.getAll();
        return ResponseEntity.ok(all);
    }
}
