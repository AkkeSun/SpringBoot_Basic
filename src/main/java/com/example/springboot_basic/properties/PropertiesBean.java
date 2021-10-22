package com.example.springboot_basic.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.Duration;

// 연관성 있는 properties를 묶어 bean으로 다루기
@ConfigurationProperties("test")
@Component
public class PropertiesBean {

    private String name;
    private int random;
    private String fullName;
    private Duration sessionTimeout;

    public void setName(String name) {
        this.name = name;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public int getRandom() {
        return random;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "PropertiesBean{" +
                "name='" + name + '\'' +
                ", random=" + random +
                ", fullName='" + fullName + '\'' +
                ", sessionTimeout=" + sessionTimeout +
                '}';
    }
}
