package com.chikuwa_latte.game_api.body;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DamageCalculateResponse {
    private final Integer maxDamage;
    private final Integer minDamage;
    private final Integer maxRate;
    private final Integer minRate;
}
