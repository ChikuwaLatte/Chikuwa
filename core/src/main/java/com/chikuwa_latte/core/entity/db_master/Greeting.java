package com.chikuwa_latte.core.entity.db_master;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Greeting {
    private final long id;
    private final String content;
}
