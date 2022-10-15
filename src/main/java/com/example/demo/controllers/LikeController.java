package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Like;
import com.example.demo.requests.LikeCreateRequest;
import com.example.demo.responses.LikeResponse;
import com.example.demo.services.LikeService;

@RestController
@RequestMapping("/likes")
public class LikeController {
    
    private LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping
    public List<LikeResponse> getAllLikes(@RequestParam Optional<Long> userId,@RequestParam Optional<Long> postId){
        return likeService.getAllLikes(userId,postId);
    }
    
    @PostMapping
    public Like createOneLike(@RequestBody LikeCreateRequest newLike){
        return likeService.createOneLike(newLike);
    }

    @GetMapping("/{likeId}")
    public Like getOneLike(@PathVariable long likeId){
        return likeService.getOneLike(likeId);
    }

    @DeleteMapping("/{likeId}")
    public void deleteOneLike(@PathVariable long likeId){
        likeService.deleteOneLike(likeId);
    }

}
