package com.example.SpringHexagonal.posts.infrastructure.inbound.controllers;

import com.example.SpringHexagonal.posts.application.find.PostFindUseCase;
import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/posts")
@RequiredArgsConstructor
public class PostController{

    private final PostFindUseCase postFindUseCase;

    @GetMapping()
    public Mono<ResponseEntity<Flux<PostQuery>>> getAllPosts() {
        return Mono.just(
                ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_JSON) // APPLICATION_JSON_UTF8
                        .body(postFindUseCase.findAllPosts())

        );
    }
}
