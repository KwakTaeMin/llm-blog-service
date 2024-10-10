package com.taemin.llm.ollama.service;

import com.taemin.llm.ollama.feign.OllamaClient;
import com.taemin.llm.ollama.feign.request.OllamaRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OllamaService {

    private final OllamaClient ollamaClient;

    public String ask(OllamaRequest ollamaRequest) {
        return ollamaClient.generate(ollamaRequest);
    }
}
