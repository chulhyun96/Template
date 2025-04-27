package com.example.demo.post.entity;

import com.example.demo.post.dto.request.PostCreateRequest;
import com.example.demo.post.dto.response.PostCreateResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private LocalDateTime createdAt;

    public static Post from(PostCreateRequest request, LocalDateTime now) {
        return Post.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .createdAt(now)
                .build();

    }
}
