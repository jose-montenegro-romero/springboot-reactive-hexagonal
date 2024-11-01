package com.example.SpringHexagonal.students.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserModel {

    private String id;
    private String name;
    private Integer score;
}