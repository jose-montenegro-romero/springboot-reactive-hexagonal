package com.example.SpringHexagonal.posts.infrastructure.outbound.external;

import com.example.SpringHexagonal.posts.domain.model.PostCommand;
import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.Map;

@Service
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

//    public Flux<PostQuery> getAllPosts() {
//        return Flux.just(
//                new PostQuery(1L, 101L, "Título 1", "Cuerpo del post 1"),
//                new PostQuery(2L, 102L, "Título 2", "Cuerpo del post 2"),
//                new PostQuery(3L, 103L, "Título 3", "Cuerpo del post 3")
//        );
//    }

    public Flux<PostQuery> create(PostCommand postCommand){
        return Flux.empty();
    }

    public Flux<?> searchByParam(Map<String, String> params){
        return Flux.empty();
    }

    public Flux<PostQuery> findPostById(int id){
        return Flux.empty();
    }
 }
