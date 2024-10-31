package com.example.SpringHexagonal.students.infrastructure.repositories;

import com.example.SpringHexagonal.students.infrastructure.entities.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<UserEntity, String> {}
