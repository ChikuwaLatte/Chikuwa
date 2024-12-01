package com.chikuwa_latte.game_api.body;

import com.chikuwa_latte.core.constant.Ailment;
import com.chikuwa_latte.core.constant.Weather;

import lombok.Data;

@Data
public class DamageCalculateRequest {
    private Integer skillId;
    private Monster attackMonster;
    private Monster defenseMonster;
    private FieldStatus fieldStatus;

    @Data
    public static class Monster {
        private Integer monsterId;
        private Integer level;
        private AbilityStatus abilityStatus;
        private Ailment ailment;
    }

    @Data
    public static class AbilityStatus {
        private Integer hp;
        private Integer attack;
        private Integer defense;
        private Integer specialAttack;
        private Integer specialDefense;
        private Integer speed;
        private Integer hitRate;
        private Integer avoidanceRate;
    }

    @Data
    public static class FieldStatus {
        private Weather weather;
    }
}
