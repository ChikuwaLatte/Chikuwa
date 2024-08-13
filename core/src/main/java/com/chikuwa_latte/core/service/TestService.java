package com.chikuwa_latte.core.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.chikuwa_latte.core.property.ServiceProperties;
import com.chikuwa_latte.core.repository.Table01Dao;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class TestService {
    private final ServiceProperties serviceProperties;
    private final Table01Dao table01Dao;

    public String message() {
        return this.serviceProperties.getMessage();
    }

    public String upsert(long userId, @NonNull String memo) {
        if (table01Dao.find(userId) == null) {
            table01Dao.create(userId, memo);
            return "created!!";
        }
        table01Dao.update(userId, memo);
        return "updated!!";
    }
}
