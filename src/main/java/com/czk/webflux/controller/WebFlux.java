package com.czk.webflux.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.logging.Handler;

@Configuration
public class WebFlux {

    @Bean
    public RouterFunction<ServerResponse> route(){
       return null;

    }
}
