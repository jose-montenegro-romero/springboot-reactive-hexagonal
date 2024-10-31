package com.example.SpringHexagonal.posts.infrastructure.outbound.external;

import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

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
 }
