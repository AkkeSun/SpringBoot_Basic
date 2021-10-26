package com.example.springboot_basic.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class RestRunner implements ApplicationRunner {

    // RestTemplate (동기)
    // Blocking 기반의 Synchronous API (SpringBoot Web에 들어있음)
    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    // WebClient (비동기)
    // Non-Blocking 기반의 Asynchronous API (Webflux 의존성 필요)
    @Autowired
    WebClient.Builder builder;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        /*
        RestTemplate restTemplate = restTemplateBuilder.build();

        StopWatch watch = new StopWatch();
        watch.start();

        String rest1Result = restTemplate.getForObject("http://localhost:8090/rest1", String.class);
        System.err.println(rest1Result);
        String rest2Result = restTemplate.getForObject("http://localhost:8090/rest2", String.class);
        System.err.println(rest2Result);

        watch.stop();
        System.out.println(watch.prettyPrint());
        // 출력 : Test1 Test2 8초
        */

        //---------------------------------------
        /*
        WebClient webClient = builder
                .baseUrl("http://localhost:8090")
                .build();

        StopWatch watch2 = new StopWatch();
        watch2.start();

        // Mono 생성
        Mono<String> rest1Mono = webClient.get().uri("/rest1")
                 .retrieve()
                 .bodyToMono(String.class);
        // Mono 로드
        rest1Mono.subscribe(s -> {System.out.println(s);});

        // Mono 생성
        Mono<String> rest2Mono = webClient.get().uri("/rest2")
                .retrieve()
                .bodyToMono(String.class);
        // Mono 로드
        rest2Mono.subscribe(s -> {System.out.println(s);});


        watch2.stop();
        System.out.println(watch2.prettyPrint());
        // 출력 : 1초 Test2 Test1
        */
    }
}
