package com.taemin.llm.ollama.api.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OllamaResponse {
    private String model;
    private String createdAt;
    private String response;
    private boolean done;

    public OllamaResponse(String model, String createdAt, String response, boolean done) {
        this.model = model;
        this.createdAt = createdAt;
        this.response = response;
        this.done = done;
    }
}
