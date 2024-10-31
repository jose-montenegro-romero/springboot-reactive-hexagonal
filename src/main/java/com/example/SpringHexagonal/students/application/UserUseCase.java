package com.example.SpringHexagonal.students.application;

import com.example.SpringHexagonal.students.infrastructure.entities.UserEntity;
import reactor.core.publisher.Flux;

public interface UserUseCase {
    public Flux<UserEntity> getUsers();
}
