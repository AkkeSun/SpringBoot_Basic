package com.example.springboot_basic.applicationListener;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// 웹서버가 초기화(생성)되면 호출
@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {

    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent initializedEvent) {
        ServletWebServerApplicationContext applicationContext = initializedEvent.getApplicationContext();
        int port = applicationContext.getWebServer().getPort();
        System.err.println("[접속 PORT] : " +port);
    }
}
