package com.example.demo.post.type;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum PostErrorStatus {
    NOT_FOUND(
            HttpStatus.NOT_FOUND.value(),
            "해당 게시글을 찾을 수 없습니다."
    );

    private final int errorCode;
    private final String errorMessage;

    PostErrorStatus(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
