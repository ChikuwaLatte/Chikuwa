package com.chikuwa_latte.core.model;

import com.chikuwa_latte.core.constant.Ailment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DamageCalculateMonsterModel {
    private final int monsterId;
    private final int level;
    private final AbilityStatusModel abilityStatusModel;
    private final Ailment ailment;
}
