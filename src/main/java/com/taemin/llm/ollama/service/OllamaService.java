package com.taemin.llm.ollama.service;

import com.taemin.llm.ollama.api.request.OllamaRequest;
import com.taemin.llm.ollama.api.response.OllamaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OllamaService {

    private final WebClient webClient;

    public Mono<String> ask(OllamaRequest ollamaRequest) {
        return webClient.post()
            .uri("/api/generate")
            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .bodyValue(ollamaRequest)
            .retrieve()
            .bodyToFlux(OllamaResponse.class)
            .takeUntil(OllamaResponse::isDone)
            .map(OllamaResponse::getResponse)
            .reduce(String::concat);
    }
}
