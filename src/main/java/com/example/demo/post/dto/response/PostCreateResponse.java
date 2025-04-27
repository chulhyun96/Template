package com.example.demo.post.dto.response;

import com.example.demo.post.entity.Post;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "게시글 생성 응답 DTO 클래스")
public class PostCreateResponse {
    @Schema(description = "게시글 제목")
    private String title;

    @Schema(description = "게시글 내용")
    private String content;

    @Schema(description = "게시글 생성 날짜")
    private LocalDateTime createdAt;

    public static PostCreateResponse from(Post savedPost) {
        return new PostCreateResponse(savedPost.getTitle(), savedPost.getContent(), savedPost.getCreatedAt());
    }
}
