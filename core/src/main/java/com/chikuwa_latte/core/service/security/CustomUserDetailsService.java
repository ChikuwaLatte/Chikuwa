package com.chikuwa_latte.core.service.security;

import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.chikuwa_latte.core.entity.db_user.User;
import com.chikuwa_latte.core.model.security.CustomUserDetails;
import com.chikuwa_latte.core.repository.db_user.UserDao;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserDao userDao;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // ユーザー名でデータベースからユーザーを検索
        User user = userDao.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        // UserEntityの情報を元にCustomUserDetailsを作成
        return new CustomUserDetails(
            user.getId(),
            user.getName(),
            user.getPassword(),
            Collections.emptyList() // ここでロールや権限をセット
        );
    }

    @Transactional
    public UserDetails loadUserById(long userId) {
        User user = userDao.find(userId);

        return new CustomUserDetails(
            userId,
            user.getName(),
            user.getPassword(),
            Collections.emptyList() // ここでロールや権限をセット
        );
    }
}
