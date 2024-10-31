package com.example.SpringHexagonal.students.infrastructure.adapters;

import com.example.SpringHexagonal.students.application.UserUseCase;
import com.example.SpringHexagonal.students.infrastructure.entities.UserEntity;
import com.example.SpringHexagonal.students.infrastructure.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class MongoUserAdapter implements UserUseCase {

    private final UserRepository userRepository;

    @Override
    public Flux<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
