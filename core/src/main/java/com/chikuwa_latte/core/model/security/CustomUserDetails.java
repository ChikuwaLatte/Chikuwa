package com.chikuwa_latte.core.model.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;

@Getter
public class CustomUserDetails implements UserDetails {
    private final long userId;
    private final String username;
    private final String password;
    private final Collection<? extends GrantedAuthority> authorities;

    public CustomUserDetails(long userId, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // 有効なアカウント
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // ロックされていないアカウント
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // 有効なクレデンシャル
    }

    @Override
    public boolean isEnabled() {
        return true; // 有効なユーザー
    }
}
