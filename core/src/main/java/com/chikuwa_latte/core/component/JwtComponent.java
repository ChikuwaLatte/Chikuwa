package com.chikuwa_latte.core.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class JwtComponent {

    @Value("${jwt.secret}")
    @Getter
    private String secret;
    @Value("${jwt.expiration}")
    @Getter
    private long expiration;
}