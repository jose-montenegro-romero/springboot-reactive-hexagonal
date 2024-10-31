package com.example.SpringHexagonal.posts.infrastructure.inbound.controllers;

import com.example.SpringHexagonal.posts.application.find.PostFindUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController{

    private final PostFindUseCase postFindUseCase;

    @GetMapping
    public ResponseEntity findAllPosts(){
        return ResponseEntity.ok(this.postFindUseCase.findAllPosts());
    }
}
