package com.chikuwa_latte.game_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("damage-calculate")
public class DamageCalculateApiController {
    private final DamageCalculateService damageCalculateService;

    @PostMapping
    public DamageCalculateResponse damageCalculate(@RequestBody DamageCalculateRequest body) {
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
                request.getAbilityStatus().getHp(),
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

    @PostMapping("/test")
    public DamageCalculateResponse test() {
        return new DamageCalculateResponse(
            200,
            2,
            85,
            70
        );
    }
}