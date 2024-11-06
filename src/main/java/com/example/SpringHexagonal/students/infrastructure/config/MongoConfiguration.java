package com.example.SpringHexagonal.students.infrastructure.config;

import com.example.SpringHexagonal.students.infrastructure.entities.UserEntity;
import com.example.SpringHexagonal.students.infrastructure.repositories.UserRepository;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import reactor.core.publisher.Flux;

import java.util.concurrent.ThreadLocalRandom;

@Configuration
@EnableMongoRepositories
public class MongoConfiguration extends AbstractReactiveMongoConfiguration {

    @Value("${mongodb.url}")
    private String url;

    @Value("${mongodb.db}")
    private String dbName;

    @Override
    protected String getDatabaseName() {
        return dbName;
    }

    @Override
    @Bean
    public MongoClient reactiveMongoClient() {
        return MongoClients.create(url);
    }

    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return new ReactiveMongoTemplate(reactiveMongoClient(), getDatabaseName());
    }

    @Bean
    @ConditionalOnProperty(prefix = "job.autorun", name = "enabled", havingValue = "true", matchIfMissing = true)
    public CommandLineRunner loadData(UserRepository repository) {
        return (args) -> {
            UserEntity tempUser = new UserEntity();
            tempUser.setName("test");
            tempUser.setScore(200);

            // save a couple of users
            var users = Flux.just(tempUser);
            repository.saveAll(users).subscribe();
        };
    }
}
