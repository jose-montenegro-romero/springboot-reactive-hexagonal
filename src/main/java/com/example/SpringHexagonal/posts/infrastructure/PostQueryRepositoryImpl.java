package com.example.SpringHexagonal.posts.infrastructure;

import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import com.example.SpringHexagonal.posts.domain.repository.PostQueryRepository;
import com.example.SpringHexagonal.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {
    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;
    @Override
    public Optional<PostQuery> findById(int id) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.findPostById(id));
    }

    @Override
    public List<PostQuery> searchBy(Map<String, String> params) {
        return jsonPlaceholderAPIClient.searchByParam(params);
    }

    @Override
    public List<PostQuery> findAllPosts() {
        return jsonPlaceholderAPIClient.getAllPosts();
    }
}