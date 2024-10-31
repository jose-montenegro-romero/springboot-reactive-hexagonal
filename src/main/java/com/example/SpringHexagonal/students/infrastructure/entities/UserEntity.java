package com.example.SpringHexagonal.students.infrastructure.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "User")
public class UserEntity {

        @Id
        private String id;

        private String name;

        private Integer score;
}
