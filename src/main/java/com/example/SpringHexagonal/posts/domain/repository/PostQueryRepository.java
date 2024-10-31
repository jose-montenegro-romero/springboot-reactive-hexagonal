package com.example.SpringHexagonal.posts.domain.repository;

import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;

public interface PostQueryRepository {
    Flux<PostQuery> findById(int id);
    Flux<List<PostQuery>> searchBy(Map<String, String> params);
    Flux<List<PostQuery>> findAllPosts();
}
