package com.example.SpringHexagonal.students.infrastructure.config;

import com.example.SpringHexagonal.students.infrastructure.entities.UserEntity;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MongoListener extends AbstractMongoEventListener<UserEntity> {

    @Override
    public void onBeforeConvert(BeforeConvertEvent<UserEntity> event) {
        super.onBeforeConvert(event);

        Date dateNow = new Date();

        event.getSource().setCreatedAt(dateNow);
        event.getSource().setUpdatedAt(dateNow);
    }
}
