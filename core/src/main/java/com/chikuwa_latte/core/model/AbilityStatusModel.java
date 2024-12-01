package com.chikuwa_latte.core.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AbilityStatusModel {
    private final Integer hp;
    private final Integer attack;
    private final Integer defense;
    private final Integer specialAttack;
    private final Integer specialDefense;
    private final Integer speed;
    private final Integer hitRate;
    private final Integer avoidanceRate;
}
