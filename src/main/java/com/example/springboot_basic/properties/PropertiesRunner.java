package com.example.springboot_basic.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PropertiesRunner implements ApplicationRunner {

    @Autowired
    PropertiesBean propertiesBean;

    @Value("${test.name}")
    private String name;

    @Value("${test.random}")
    private int random;

    @Value("${test.fullName}")
    private String fullName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        System.out.println(name);
        System.out.println(random);
        System.out.println(fullName);
        System.out.println(propertiesBean.toString());
        */
    }
}
