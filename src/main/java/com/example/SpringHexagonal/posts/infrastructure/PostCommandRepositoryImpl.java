package com.example.SpringHexagonal.posts.infrastructure;

import com.example.SpringHexagonal.posts.domain.model.PostCommand;
import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import com.example.SpringHexagonal.posts.domain.repository.PostCommandRepository;
import com.example.SpringHexagonal.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostCommandRepositoryImpl implements PostCommandRepository {
    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;

    @Override
    public Optional<PostQuery> createPost(PostCommand postCommand) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.create(postCommand));
    }

    @Override
    public Optional<PostQuery> updatePost(PostCommand postCommand) {
        //Código a implementar
        return Optional.empty();
    }

    @Override
    public void deletePost(int id) {
        //Código a implementar
    }
}