package com.taemin.llm.ollama.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${ollama.api.url}")
    private String ollamaUrl;
    @Value("${ollama.api.port}")
    private String ollamaPort;

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
            .baseUrl("http://" + ollamaUrl + ":" + ollamaPort)
            .build();
    }

}
