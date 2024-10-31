package com.example.SpringHexagonal.posts.infrastructure;

import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import com.example.SpringHexagonal.posts.domain.repository.PostQueryRepository;
import com.example.SpringHexagonal.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {

    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;

    @Override
    public Flux<PostQuery> findAllPosts() {
        return jsonPlaceholderAPIClient.getAllPosts();
    }

}