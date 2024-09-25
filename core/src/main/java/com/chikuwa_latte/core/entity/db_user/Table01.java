package com.chikuwa_latte.core.entity.db_user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Table01 {
    private final Long userId;
    private final String memo;
}
