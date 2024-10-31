package com.example.SpringHexagonal.students.infrastructure.handlers;

import com.example.SpringHexagonal.students.infrastructure.services.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;

@Component
@RequiredArgsConstructor
public class UserHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserHandler.class);

    private final UserServiceImpl userService;

    public Mono<ServerResponse> getAll(ServerRequest request) {
        return userService.getUsers().collectList().flatMap(users -> {
            if (users.isEmpty()) {
                return ServerResponse.noContent().build();
            }
            return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                    .body(fromValue(users));
        });
    }
}
