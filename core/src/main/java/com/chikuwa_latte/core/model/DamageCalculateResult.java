package com.chikuwa_latte.core.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DamageCalculateResult {
    private final int maxDamage;
    private final int minDamage;
    private final int maxRate;
    private final int minRate;
}
