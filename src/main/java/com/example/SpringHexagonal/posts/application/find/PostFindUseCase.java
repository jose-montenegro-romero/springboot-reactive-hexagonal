package com.example.SpringHexagonal.posts.application.find;

import com.example.SpringHexagonal.posts.domain.model.PostQuery;
import com.example.SpringHexagonal.posts.domain.repository.PostQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PostFindUseCase {

    private final PostQueryRepository postQueryRepository;

    public List<PostQuery> findAllPosts(){
        return this.postQueryRepository.findAllPosts();
    }
    public PostQuery findById(Integer id){
        return this.postQueryRepository.findById(id).orElseThrow();
    }
    public List<PostQuery> findAllPostsByUserId(Integer userId){
        return this.postQueryRepository.searchBy(Map.of("userId",String.valueOf(userId)));
    }
}
