package com.example.SpringHexagonal.students.domain.repository;

import com.example.SpringHexagonal.students.domain.model.UserModel;

public interface UserRepository {

   UserModel findUserByName(String name);
}
