package com.example.demo.post.exception;

import lombok.Getter;

@Getter
public class PostException extends RuntimeException{
    private final int errorCode;
    private final String errorMessage;

    public PostException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
