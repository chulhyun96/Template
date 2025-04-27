package com.example.demo.post.dto.response;

import com.example.demo.post.entity.Post;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "게시글 단건 조회 시 응답 DTO")
public class PostResponse {
    @Schema(description = "게시글 제목")
    private String title;

    @Schema(description = "게시글 내용")
    private String content;

    @Schema(description = "게시글 생성 날짜")
    private LocalDateTime createdAt;

    public static PostResponse from(Post findedPost) {
        return new PostResponse(findedPost.getTitle(), findedPost.getContent(), findedPost.getCreatedAt());
    }
}
