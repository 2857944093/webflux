package com.czk.webflux.controller;

import com.czk.webflux.handler.HiHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class HiRouter {

    @Bean
    public RouterFunction<ServerResponse> routeHi(HiHandler hiHandler){
        return RouterFunctions
                .route(RequestPredicates.GET("/hi")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),hiHandler::Hi);
    }

    @Bean
    public RouterFunction<ServerResponse> routeHello(HiHandler hiHandler){
        return RouterFunctions
                .route(RequestPredicates.GET("/get")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),hiHandler::Hello);
    }


}
