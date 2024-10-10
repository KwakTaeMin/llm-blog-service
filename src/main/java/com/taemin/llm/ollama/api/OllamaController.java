package com.taemin.llm.ollama.api;

import com.taemin.llm.ollama.feign.request.OllamaRequest;
import com.taemin.llm.ollama.service.OllamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OllamaController {

    private final OllamaService ollamaService;

    @PostMapping("/ask")
    public String ask(@RequestBody OllamaRequest ollamaRequest) {
        return ollamaService.ask(ollamaRequest);
    }
}
