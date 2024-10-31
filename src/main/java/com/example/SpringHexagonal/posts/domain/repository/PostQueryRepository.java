package com.example.SpringHexagonal.posts.domain.repository;

import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import reactor.core.publisher.Flux;

public interface PostQueryRepository {
    Flux<PostQuery> findAllPosts();
}
