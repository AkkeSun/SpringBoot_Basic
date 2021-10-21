package com.example.springboot_basic.applicationListener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


// ApplicationContext 구동 후 실행
@Component
public class PostListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("========================");
        System.out.println("===== HELLO LOWLOW =====");
        System.out.println("========================");
    }
}
