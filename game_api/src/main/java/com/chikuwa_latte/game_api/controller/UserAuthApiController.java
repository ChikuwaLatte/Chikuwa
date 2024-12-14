package com.chikuwa_latte.game_api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chikuwa_latte.core.component.JwtHandleComponent;
import com.chikuwa_latte.core.entity.db_user.User;
import com.chikuwa_latte.core.repository.db_user.UserDao;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class UserAuthApiController {
    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;
    private final JwtHandleComponent jwtHandleComponent;

    @PostMapping("/register")
    public Map<String, String> register(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDao.create(user);
        Map<String, String> response = new HashMap<>();
        response.put("message", "User registered successfully!");
        return response;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> loginData) {
        // ユーザー検索
        User user = userDao.find(Long.parseLong(loginData.get("id")));

        // パスワード検証
        if (!passwordEncoder.matches(loginData.get("password"), user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        // JWT生成
        String token = jwtHandleComponent.generateJwtToken(user.getName());
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
