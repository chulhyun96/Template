package com.example.demo.post.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Schema(description = "새로운 게시글 요청 DTO 클래스")
public class PostCreateRequest {
    @Schema(description = "게시글 제목")
    @NotBlank(message = "제목은 비어있을 수 없습니다.")
    private String title;

    @Schema(description = "게시글 내용")
    @NotBlank(message = "내용은 비어있을 수 없습니다.")
    private String content;
}
