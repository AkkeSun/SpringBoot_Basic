package com.example.springboot_basic.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;

@Component
public class RestRunner implements ApplicationRunner {

    // Blocking 기반의 Synchronous API (spring web에서 자동등록해줌)
    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        StopWatch watch = new StopWatch();
        watch.start();

        watch.stop();
        System.out.println(watch.prettyPrint());
    }
}
