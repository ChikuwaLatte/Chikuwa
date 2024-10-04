package com.chikuwa_latte.game_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chikuwa_latte.core.model.AbilityStatusModel;
import com.chikuwa_latte.core.model.DamageCalculateMonsterModel;
import com.chikuwa_latte.core.model.DamageCalculateResult;
import com.chikuwa_latte.core.model.FieldStatusModel;
import com.chikuwa_latte.core.service.DamageCalculateService;
import com.chikuwa_latte.game_api.body.DamageCalculateRequest;
import com.chikuwa_latte.game_api.body.DamageCalculateResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("damage-calcurate")
public class DamageCalculateApiController {
    private final DamageCalculateService damageCalculateService;

    @GetMapping
    public DamageCalculateResponse damageCalcurate(DamageCalculateRequest body) {
        DamageCalculateResult result = damageCalculateService.calcDamage(
            body.getSkillId(),
            convertMonster(body.getAttackMonster()),
            convertMonster(body.getDefenseMonster()),
            new FieldStatusModel(
                body.getFieldStatus().getWeather()
            )
        );

        return new DamageCalculateResponse(
            result.getMaxDamage(),
            result.getMinDamage(),
            result.getMaxRate(),
            result.getMinRate()
        );
    }

    private DamageCalculateMonsterModel convertMonster(DamageCalculateRequest.Monster request) {
        return new DamageCalculateMonsterModel(
            request.getMonsterId(),
            request.getLevel(),
            new AbilityStatusModel(
                request.getAbilityStatus().getAttack(),
                request.getAbilityStatus().getDefense(),
                request.getAbilityStatus().getSpecialAttack(),
                request.getAbilityStatus().getSpecialDefense(),
                request.getAbilityStatus().getSpeed(),
                request.getAbilityStatus().getHitRate(),
                request.getAbilityStatus().getAvoidanceRate()
            ),
            request.getAilment()
        );
    }
}