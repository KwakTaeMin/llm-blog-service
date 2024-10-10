package com.taemin.llm.ollama.feign;

import com.taemin.llm.ollama.feign.request.OllamaRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ollamaClient", url = "${ollama.api.url}:${ollama.api.port}")
public interface OllamaClient {
    @PostMapping(path = "/api/generate", headers = "Content-Type=application/json")
    String generate(@RequestBody OllamaRequest ollamaRequest);
}
