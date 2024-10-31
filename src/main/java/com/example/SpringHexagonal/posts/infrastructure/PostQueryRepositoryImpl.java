package com.example.SpringHexagonal.posts.infrastructure;

import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import com.example.SpringHexagonal.posts.domain.repository.PostQueryRepository;
import com.example.SpringHexagonal.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {
    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;
    @Override
    public Flux<PostQuery> findById(int id) {
        return jsonPlaceholderAPIClient.findPostById(id);
    }

    @Override
    public Flux<List<PostQuery>> searchBy(Map<String, String> params) {
        return null;
    }

    @Override
    public Flux<List<PostQuery>> findAllPosts() {
        return null;
    }

//    @Override
//    public Flux<?> searchBy(Map<String, String> params) {
//        return jsonPlaceholderAPIClient.searchByParam(params);
//    }
//
//    @Override
//    public Flux<?> findAllPosts() {
//        return jsonPlaceholderAPIClient.getAllPosts();
//    }
}