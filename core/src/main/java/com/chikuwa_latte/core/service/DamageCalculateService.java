package com.chikuwa_latte.core.service;

import org.springframework.stereotype.Service;

import com.chikuwa_latte.core.model.DamageCalculateMonsterModel;
import com.chikuwa_latte.core.model.DamageCalculateResult;
import com.chikuwa_latte.core.model.FieldStatusModel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DamageCalculateService {
    public DamageCalculateResult calcDamage(
        int skillId,
        DamageCalculateMonsterModel attackMonster,
        DamageCalculateMonsterModel defenseMonster,
        FieldStatusModel fieldStatusModel
    ) {
        return new DamageCalculateResult(10, 5, 85, 100);
    }
}
