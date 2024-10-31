package com.example.SpringHexagonal.posts.application.find;

import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import com.example.SpringHexagonal.posts.domain.repository.PostQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class PostFindUseCase {

    private final PostQueryRepository postQueryRepository;

    public Flux<PostQuery> findAllPosts(){
        return this.postQueryRepository.findAllPosts();
    }
}
