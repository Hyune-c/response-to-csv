package com.example.responsetocsv.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Service
public class GetWebClientService {

    private final WebClient webClient;

    public Mono<String> get(String uri) {
        return webClient.get()
            .uri(uri)
            .retrieve()
            .bodyToMono(String.class)
            .doOnError(s -> log.info("### error={}", s));
    }
}
