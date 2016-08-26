package com.izual.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.reactive.WebClient;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/reactive")
public class ReactiveController {


    @Autowired
    WebClient webClient;

    @RequestMapping("/test")
    public Flux<String> say100Numbers() {
        return Flux.range(0, 100)
                .map(String::valueOf)
                .map(String::toUpperCase)
                .map(s -> {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return s;
                });
    }
}
