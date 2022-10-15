package com.example.demo.responses;

import com.example.demo.entities.Comment;

import lombok.Data;

@Data
public class CommentResponse {
    Long id;
    Long userId;
    Long postId;
    String text;
    public CommentResponse(Comment comment) {
        this.id = comment.getId();
        this.userId = comment.getUser().getId();
        this.postId = comment.getPost().getId();
        this.text = comment.getText();
    }
}
