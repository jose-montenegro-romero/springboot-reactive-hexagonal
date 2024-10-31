package com.example.SpringHexagonal.students.infrastructure.services;

import com.example.SpringHexagonal.students.application.UserUseCase;
import com.example.SpringHexagonal.students.infrastructure.entities.UserEntity;
import com.example.SpringHexagonal.students.infrastructure.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserUseCase {

    private final UserRepository userRepository;

    @Override
    public Flux<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}
