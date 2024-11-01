package com.example.SpringHexagonal.students.infrastructure.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Getter
@Setter
@Document(collection = "users")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

        @MongoId(FieldType.OBJECT_ID)
        private String id;

        private String name;

        private Integer score;

        private Date createdAt;

        private Date updatedAt;
}
