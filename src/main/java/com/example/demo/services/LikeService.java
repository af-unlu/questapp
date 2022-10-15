package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Like;
import com.example.demo.repos.LikeRepository;
import com.example.demo.requests.LikeCreateRequest;
import com.example.demo.responses.LikeResponse;

@Service
public class LikeService {
    private LikeRepository likeRepository;
    private PostService postService;
    
    public LikeService(LikeRepository likeRepository, PostService postService) {
        this.likeRepository = likeRepository;
        this.postService = postService;
    }

    public List<LikeResponse> getAllLikes(Optional<Long> userId, Optional<Long> postId) {
        return null;
    }

    public Like createOneLike(LikeCreateRequest newLike) {
        return null;
    }

    public Like getOneLike(long likeId) {
        return null;
    }

    public void deleteOneLike(long likeId) {
        
    }



}
