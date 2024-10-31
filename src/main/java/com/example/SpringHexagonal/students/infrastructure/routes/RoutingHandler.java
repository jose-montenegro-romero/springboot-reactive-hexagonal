package com.example.SpringHexagonal.students.infrastructure.routes;

import com.example.SpringHexagonal.students.infrastructure.handlers.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RoutingHandler {

    private static final String API = "/api/v1/users";
    private static final String ID = "/{id}";

    @Bean
    public RouterFunction<ServerResponse> userRouter(UserHandler userHandler) {
        return route(GET(API), userHandler::getAll);
//                .andRoute(GET("/flux"), bookHandler::mostrarMensajeFlux)
//                .andRoute(GET("/books"), bookHandler::getAllBooks)
//                .andRoute(GET("/books/{id}"), bookHandler::findById)
//                .andRoute(POST("/books"), bookHandler::saveBook)
//                .andRoute(PUT("/books/{id}"), bookHandler::saveUpdateBook)
//                .andRoute(DELETE("/books/{id}"), bookHandler::deleteById)
    }
}
