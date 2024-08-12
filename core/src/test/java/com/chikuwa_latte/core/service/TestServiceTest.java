package com.chikuwa_latte.core.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.chikuwa_latte.core.dao.Table01Dao;

@SpringBootTest("service.message=Hello")
public class TestServiceTest {
    @MockBean
    private Table01Dao table01Dao;
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
