package com.izual;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.client.reactive.WebClient;

@Configuration
public class Config {

    @Bean
    WebClient webClient() {
        return new WebClient(new ReactorClientHttpConnector());
    }
}
