package com.chikuwa_latte.game_api.body;

import com.chikuwa_latte.core.constant.Ailment;
import com.chikuwa_latte.core.constant.Weather;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DamageCalculateRequest {
    private final Integer skillId;
    private final Monster attackMonster;
    private final Monster defenseMonster;
    private final FieldStatus fieldStatus;

    @Getter
    @RequiredArgsConstructor
    public class Monster {
        private final Integer monsterId;
        private final Integer level;
        private final AbilityStatus abilityStatus;
        private final Ailment ailment;
    }

    @Getter
    @RequiredArgsConstructor
    public class AbilityStatus {
        private final Integer attack;
        private final Integer defense;
        private final Integer specialAttack;
        private final Integer specialDefense;
        private final Integer speed;
        private final Integer hitRate;
        private final Integer avoidanceRate;
    }

    @Getter
    @RequiredArgsConstructor
    public class FieldStatus {
        private final Weather weather;
    }
}
