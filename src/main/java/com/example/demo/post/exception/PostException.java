package com.example.demo.post.exception;

import com.example.demo.post.type.PostErrorStatus;
import lombok.Getter;

@Getter
public class PostException extends RuntimeException{
    private final int errorCode;
    private final String errorMessage;

    public PostException(PostErrorStatus errorStatus) {
        super(errorStatus.getErrorMessage());
        this.errorCode = errorStatus.getErrorCode();
        this.errorMessage = errorStatus.getErrorMessage();
    }
}
