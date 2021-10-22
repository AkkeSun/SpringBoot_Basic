package com.example.springboot_basic;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**************
 * @TestPropertySource
 * 테스트 시 properties 데이터를 바꾸고 싶을 때 사용
 * 바꿀 데이터가 적을 때 : @TestPropertySource(properties = "test.name=sun2")
 * 바꿀 데이터가 많을 때 : @TestPropertySource(locations = "classpath:/test.properties")
 *
 * test에 resource폴더 생성
 * Project Structure - Modules - test/resource 선택 후 Test Resources 클릭한 후에 properties 파일 만들어줘야 build 됨
 **************/

@SpringBootTest
@TestPropertySource(locations = "classpath:/test.properties")
public class PropertiesRunnerTest {

    @Autowired
    Environment environment; // properties를 꺼낼 수 있는 클래스

    @Test
    public void propertiesTest(){
        assertThat(environment.getProperty("test.name"))
                .isEqualTo("sun3");
    }

}