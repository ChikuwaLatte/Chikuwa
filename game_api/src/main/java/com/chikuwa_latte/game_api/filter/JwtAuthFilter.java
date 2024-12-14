package com.chikuwa_latte.game_api.filter;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.chikuwa_latte.core.component.JwtHandleComponent;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {
    private final JwtHandleComponent jwtHandleComponent; // JWTトークン管理クラス
    private final UserDetailsService userDetailsService; // Spring Securityのユーザ管理

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // Authorizationヘッダーからトークンを取得
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        final String username;

        // トークンが無い、または形式が異なる場合は次のフィルターへ
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        // トークンからJWT部分を抽出
        jwt = authHeader.substring(7); // "Bearer "を除去
        username = jwtHandleComponent.getUsernameFromJwtToken(jwt); // トークンからユーザ名を取得

        // トークンが有効で、セキュリティコンテキストが空の場合
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            // ユーザー詳細情報をロード
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);

            // トークンが有効か検証
            if (jwtHandleComponent.validateJwtToken(jwt)) {
                // 認証情報を作成してセキュリティコンテキストに設定
                UsernamePasswordAuthenticationToken authToken =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }

        // 次のフィルターに処理を渡す
        filterChain.doFilter(request, response);
    }
}
