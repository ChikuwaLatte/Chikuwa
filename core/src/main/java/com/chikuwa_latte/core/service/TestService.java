package com.chikuwa_latte.core.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.chikuwa_latte.core.property.ServiceProperties;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class TestService {
    private final ServiceProperties serviceProperties;

    public String message() {
        return this.serviceProperties.getMessage();
    }
}
