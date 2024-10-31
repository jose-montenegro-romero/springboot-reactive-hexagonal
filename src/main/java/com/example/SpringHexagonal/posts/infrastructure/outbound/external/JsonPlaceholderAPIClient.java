package com.example.SpringHexagonal.posts.infrastructure.outbound.external;

import com.example.SpringHexagonal.posts.domain.model.PostCommand;
import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.Map;

@RequiredArgsConstructor
public class JsonPlaceholderAPIClient {

    private final WebClient client;

    public Flux<PostQuery> getAllPosts() {
        return client
                .get()
                .uri("posts")
                .retrieve()
                .bodyToFlux(PostQuery.class);
    }

    public Flux<?> create(PostCommand postCommand){
        return Flux.empty();
    }

    public Flux<?> searchByParam(Map<String, String> params){
        return Flux.empty();
    }

    public Flux<?> findPostById(int id){
        return Flux.empty();
    }
 }
