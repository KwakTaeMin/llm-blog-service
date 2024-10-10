package com.taemin.llm.ollama.feign.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.taemin.llm.ollama.feign")
public class FeginConfig {
}
