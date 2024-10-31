//package com.example.SpringHexagonal.posts.application.find;
//
//import com.example.SpringHexagonal.posts.domain.model.PostQuery;
//import com.example.SpringHexagonal.posts.domain.repository.PostQueryRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import reactor.core.publisher.Flux;
//
//import java.util.List;
//import java.util.Map;
//
//@Service
//@RequiredArgsConstructor
//public class PostFindUseCase {
//
//    private final PostQueryRepository postQueryRepository;
//
//    public Flux<List<PostQuery>> findAllPosts(){
//        return this.postQueryRepository.findAllPosts();
//    }
//    public Flux<PostQuery> findById(Integer id){
//        return this.postQueryRepository.findById(id);
//    }
//    public Flux<List<PostQuery>> findAllPostsByUserId(Integer userId){
//        return this.postQueryRepository.searchBy(Map.of("userId",String.valueOf(userId)));
//    }
//}
