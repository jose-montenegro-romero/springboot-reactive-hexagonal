package com.example.SpringHexagonal.posts.domain.repository;

import com.example.SpringHexagonal.posts.domain.model.PostCommand;
import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

public interface PostCommandRepository {
    Flux<PostQuery> createPost(PostCommand postCommand);
    Flux<PostQuery> updatePost(PostCommand postCommand);
    void deletePost(int id);
}
