package com.chikuwa_latte.core.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

import com.chikuwa_latte.core.constant.SkillType;
import com.chikuwa_latte.core.entity.db_master.Skill;
import com.chikuwa_latte.core.model.DamageCalculateMonsterModel;
import com.chikuwa_latte.core.model.DamageCalculateResult;
import com.chikuwa_latte.core.model.FieldStatusModel;
import com.chikuwa_latte.core.repository.db_master.SkillDao;

import io.micrometer.common.lang.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DamageCalculateService {
    private final SkillDao skillDao;

    public DamageCalculateResult calcDamage(
        int skillId,
        DamageCalculateMonsterModel attackMonster,
        DamageCalculateMonsterModel defenseMonster,
        FieldStatusModel fieldStatusModel
    ) {
        Skill skill = skillDao.find(skillId);
        // 攻撃側のレベル×2÷5+2→切り捨て
        int maxDamage = BigDecimal.valueOf(attackMonster.getLevel())
            .multiply(BigDecimal.valueOf(2))
            .divide(BigDecimal.valueOf(5), RoundingMode.FLOOR)
            .add(BigDecimal.valueOf(2))
            .setScale(0, RoundingMode.FLOOR)
            // ×物理技(特殊技)の威力×攻撃側のこうげき(とくこう)÷防御側のぼうぎょ(とくぼう)→切り捨て
            .multiply(BigDecimal.valueOf(skill.getPower()))
            .multiply(BigDecimal.valueOf(getMonsterParameter(attackMonster, skill.getSkillType(), true)))
            .divide(BigDecimal.valueOf(getMonsterParameter(defenseMonster, skill.getSkillType(), false)), RoundingMode.FLOOR)
            .setScale(0, RoundingMode.FLOOR)
            // ÷50+2→切り捨て
            .divide(BigDecimal.valueOf(50), RoundingMode.FLOOR)
            .add(BigDecimal.valueOf(2))
            .setScale(0, RoundingMode.FLOOR)
            // ×乱数(0.85, 0.86, …… ,0.99, 1.00 のどれか)→切り捨て
            // 今回はまず最大を算出するので不要
            // .multiply(BigDecimal.valueOf(85.0 + (Math.random() * 15.0)))
            // .divide(BigDecimal.valueOf(100))
            // .setScale(0, RoundingMode.FLOOR)
            .intValue();

        // 最小ダメージは最大ダメージの0.85倍
        int minDamage = BigDecimal.valueOf(maxDamage)
            .multiply(BigDecimal.valueOf(85))
            .divide(BigDecimal.valueOf(100), RoundingMode.FLOOR)
            .setScale(0, RoundingMode.FLOOR)
            .intValue();

        // 防御側モンスターのHPに対して最大で何%のダメージが出るか
        int maxRate = getDamagePercentage(defenseMonster.getAbilityStatusModel().getHp(), maxDamage);
        int minRate = getDamagePercentage(defenseMonster.getAbilityStatusModel().getHp(), minDamage);

        return new DamageCalculateResult(maxDamage, minDamage, maxRate, minRate);
    }

    private int getMonsterParameter(@NonNull DamageCalculateMonsterModel model, @NonNull SkillType skillType, boolean isAttacker) {
        switch (skillType) {
            case PHYSICAL:
                return isAttacker
                    ? model.getAbilityStatusModel().getAttack()
                    : model.getAbilityStatusModel().getDefense();
            case SPECIAL:
                return isAttacker
                    ? model.getAbilityStatusModel().getSpecialAttack()
                    : model.getAbilityStatusModel().getSpecialDefense();
            case CONTROL:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int getDamagePercentage(int hp, int damage) {
        return BigDecimal.valueOf(hp)
            .divide(BigDecimal.valueOf(damage), RoundingMode.FLOOR)
            .multiply(BigDecimal.valueOf(100))
            .setScale(0, RoundingMode.FLOOR)
            .intValue();
    }
}
