package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Comment;
import com.example.demo.requests.CommentCreateRequest;
import com.example.demo.requests.CommentUpdateRequest;
import com.example.demo.responses.CommentResponse;

import com.example.demo.repos.CommentRepository;

@Service
public class CommentService {
    
    private CommentRepository commentRepository;
    private PostService postService;
    
    public CommentService(CommentRepository commentRepository, PostService postService) {
    this.commentRepository = commentRepository;
        this.postService = postService;
    }

    public List<CommentResponse> getAllComments(Optional<Long> userId, Optional<Long> postId) {
        return null;
    }

    public Comment createOneComment(CommentCreateRequest newComment) {
        return null;
    }

    public Comment getOneComment(long commentId) {
        return null;
    }

    public Comment updateOneComment(long commentId, CommentUpdateRequest updateComment) {
        return null;
    }

    public void deleteOneComment(Long commentId) {
    }    
}
