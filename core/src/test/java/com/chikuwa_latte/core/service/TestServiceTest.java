package com.chikuwa_latte.core.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest("service.message=Hello")
public class TestServiceTest {
    @Autowired
    private TestService testService;

    @Test
    void test() {
        assertThat(testService.message()).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {

    }
}
