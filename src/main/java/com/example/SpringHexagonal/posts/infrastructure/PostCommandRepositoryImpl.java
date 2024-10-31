//package com.example.SpringHexagonal.posts.infrastructure;
//
//import com.example.SpringHexagonal.posts.domain.model.PostCommand;
//import com.example.SpringHexagonal.posts.domain.model.PostQuery;
//import com.example.SpringHexagonal.posts.domain.repository.PostCommandRepository;
//import com.example.SpringHexagonal.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//import reactor.core.publisher.Flux;
//
//import java.util.Optional;
//
//@Repository
//@RequiredArgsConstructor
//public class PostCommandRepositoryImpl implements PostCommandRepository {
//    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;
//
//    @Override
//    public Flux<PostQuery> createPost(PostCommand postCommand) {
//        return jsonPlaceholderAPIClient.create(postCommand);
//    }
//
//    @Override
//    public Flux<PostQuery> updatePost(PostCommand postCommand) {
//        return Flux.empty();
//    }
//
//    @Override
//    public void deletePost(int id) {
//        //Código a implementar
//    }
//}