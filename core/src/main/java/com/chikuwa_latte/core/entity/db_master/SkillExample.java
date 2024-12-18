package com.chikuwa_latte.core.entity.db_master;

import com.chikuwa_latte.core.constant.AbilityType;
import com.chikuwa_latte.core.constant.Ailment;
import com.chikuwa_latte.core.constant.AttributeType;
import com.chikuwa_latte.core.constant.CriticalRateType;
import com.chikuwa_latte.core.constant.EffectType;
import com.chikuwa_latte.core.constant.SkillType;
import java.util.ArrayList;
import java.util.List;

public class SkillExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public SkillExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkillTypeIsNull() {
            addCriterion("skill_type is null");
            return (Criteria) this;
        }

        public Criteria andSkillTypeIsNotNull() {
            addCriterion("skill_type is not null");
            return (Criteria) this;
        }

        public Criteria andSkillTypeEqualTo(SkillType value) {
            addCriterion("skill_type =", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeNotEqualTo(SkillType value) {
            addCriterion("skill_type <>", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeGreaterThan(SkillType value) {
            addCriterion("skill_type >", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeGreaterThanOrEqualTo(SkillType value) {
            addCriterion("skill_type >=", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeLessThan(SkillType value) {
            addCriterion("skill_type <", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeLessThanOrEqualTo(SkillType value) {
            addCriterion("skill_type <=", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeLike(SkillType value) {
            addCriterion("skill_type like", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeNotLike(SkillType value) {
            addCriterion("skill_type not like", value, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeIn(List<SkillType> values) {
            addCriterion("skill_type in", values, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeNotIn(List<SkillType> values) {
            addCriterion("skill_type not in", values, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeBetween(SkillType value1, SkillType value2) {
            addCriterion("skill_type between", value1, value2, "skillType");
            return (Criteria) this;
        }

        public Criteria andSkillTypeNotBetween(SkillType value1, SkillType value2) {
            addCriterion("skill_type not between", value1, value2, "skillType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeIsNull() {
            addCriterion("attribute_type is null");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeIsNotNull() {
            addCriterion("attribute_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeEqualTo(AttributeType value) {
            addCriterion("attribute_type =", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeNotEqualTo(AttributeType value) {
            addCriterion("attribute_type <>", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeGreaterThan(AttributeType value) {
            addCriterion("attribute_type >", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeGreaterThanOrEqualTo(AttributeType value) {
            addCriterion("attribute_type >=", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeLessThan(AttributeType value) {
            addCriterion("attribute_type <", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeLessThanOrEqualTo(AttributeType value) {
            addCriterion("attribute_type <=", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeLike(AttributeType value) {
            addCriterion("attribute_type like", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeNotLike(AttributeType value) {
            addCriterion("attribute_type not like", value, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeIn(List<AttributeType> values) {
            addCriterion("attribute_type in", values, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeNotIn(List<AttributeType> values) {
            addCriterion("attribute_type not in", values, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeBetween(AttributeType value1, AttributeType value2) {
            addCriterion("attribute_type between", value1, value2, "attributeType");
            return (Criteria) this;
        }

        public Criteria andAttributeTypeNotBetween(AttributeType value1, AttributeType value2) {
            addCriterion("attribute_type not between", value1, value2, "attributeType");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(Integer value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(Integer value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(Integer value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(Integer value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(Integer value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<Integer> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<Integer> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(Integer value1, Integer value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andHitRateIsNull() {
            addCriterion("hit_rate is null");
            return (Criteria) this;
        }

        public Criteria andHitRateIsNotNull() {
            addCriterion("hit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHitRateEqualTo(Integer value) {
            addCriterion("hit_rate =", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateNotEqualTo(Integer value) {
            addCriterion("hit_rate <>", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateGreaterThan(Integer value) {
            addCriterion("hit_rate >", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hit_rate >=", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateLessThan(Integer value) {
            addCriterion("hit_rate <", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateLessThanOrEqualTo(Integer value) {
            addCriterion("hit_rate <=", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateIn(List<Integer> values) {
            addCriterion("hit_rate in", values, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateNotIn(List<Integer> values) {
            addCriterion("hit_rate not in", values, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateBetween(Integer value1, Integer value2) {
            addCriterion("hit_rate between", value1, value2, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateNotBetween(Integer value1, Integer value2) {
            addCriterion("hit_rate not between", value1, value2, "hitRate");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeIsNull() {
            addCriterion("critical_rate_type is null");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeIsNotNull() {
            addCriterion("critical_rate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeEqualTo(CriticalRateType value) {
            addCriterion("critical_rate_type =", value, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeNotEqualTo(CriticalRateType value) {
            addCriterion("critical_rate_type <>", value, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeGreaterThan(CriticalRateType value) {
            addCriterion("critical_rate_type >", value, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeGreaterThanOrEqualTo(CriticalRateType value) {
            addCriterion("critical_rate_type >=", value, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeLessThan(CriticalRateType value) {
            addCriterion("critical_rate_type <", value, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeLessThanOrEqualTo(CriticalRateType value) {
            addCriterion("critical_rate_type <=", value, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeLike(CriticalRateType value) {
            addCriterion("critical_rate_type like", value, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeNotLike(CriticalRateType value) {
            addCriterion("critical_rate_type not like", value, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeIn(List<CriticalRateType> values) {
            addCriterion("critical_rate_type in", values, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeNotIn(List<CriticalRateType> values) {
            addCriterion("critical_rate_type not in", values, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeBetween(CriticalRateType value1, CriticalRateType value2) {
            addCriterion("critical_rate_type between", value1, value2, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andCriticalRateTypeNotBetween(CriticalRateType value1, CriticalRateType value2) {
            addCriterion("critical_rate_type not between", value1, value2, "criticalRateType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeIsNull() {
            addCriterion("effect_type is null");
            return (Criteria) this;
        }

        public Criteria andEffectTypeIsNotNull() {
            addCriterion("effect_type is not null");
            return (Criteria) this;
        }

        public Criteria andEffectTypeEqualTo(EffectType value) {
            addCriterion("effect_type =", value, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeNotEqualTo(EffectType value) {
            addCriterion("effect_type <>", value, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeGreaterThan(EffectType value) {
            addCriterion("effect_type >", value, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeGreaterThanOrEqualTo(EffectType value) {
            addCriterion("effect_type >=", value, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeLessThan(EffectType value) {
            addCriterion("effect_type <", value, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeLessThanOrEqualTo(EffectType value) {
            addCriterion("effect_type <=", value, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeLike(EffectType value) {
            addCriterion("effect_type like", value, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeNotLike(EffectType value) {
            addCriterion("effect_type not like", value, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeIn(List<EffectType> values) {
            addCriterion("effect_type in", values, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeNotIn(List<EffectType> values) {
            addCriterion("effect_type not in", values, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeBetween(EffectType value1, EffectType value2) {
            addCriterion("effect_type between", value1, value2, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectTypeNotBetween(EffectType value1, EffectType value2) {
            addCriterion("effect_type not between", value1, value2, "effectType");
            return (Criteria) this;
        }

        public Criteria andEffectRateIsNull() {
            addCriterion("effect_rate is null");
            return (Criteria) this;
        }

        public Criteria andEffectRateIsNotNull() {
            addCriterion("effect_rate is not null");
            return (Criteria) this;
        }

        public Criteria andEffectRateEqualTo(Integer value) {
            addCriterion("effect_rate =", value, "effectRate");
            return (Criteria) this;
        }

        public Criteria andEffectRateNotEqualTo(Integer value) {
            addCriterion("effect_rate <>", value, "effectRate");
            return (Criteria) this;
        }

        public Criteria andEffectRateGreaterThan(Integer value) {
            addCriterion("effect_rate >", value, "effectRate");
            return (Criteria) this;
        }

        public Criteria andEffectRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("effect_rate >=", value, "effectRate");
            return (Criteria) this;
        }

        public Criteria andEffectRateLessThan(Integer value) {
            addCriterion("effect_rate <", value, "effectRate");
            return (Criteria) this;
        }

        public Criteria andEffectRateLessThanOrEqualTo(Integer value) {
            addCriterion("effect_rate <=", value, "effectRate");
            return (Criteria) this;
        }

        public Criteria andEffectRateIn(List<Integer> values) {
            addCriterion("effect_rate in", values, "effectRate");
            return (Criteria) this;
        }

        public Criteria andEffectRateNotIn(List<Integer> values) {
            addCriterion("effect_rate not in", values, "effectRate");
            return (Criteria) this;
        }

        public Criteria andEffectRateBetween(Integer value1, Integer value2) {
            addCriterion("effect_rate between", value1, value2, "effectRate");
            return (Criteria) this;
        }

        public Criteria andEffectRateNotBetween(Integer value1, Integer value2) {
            addCriterion("effect_rate not between", value1, value2, "effectRate");
            return (Criteria) this;
        }

        public Criteria andAilmentIsNull() {
            addCriterion("ailment is null");
            return (Criteria) this;
        }

        public Criteria andAilmentIsNotNull() {
            addCriterion("ailment is not null");
            return (Criteria) this;
        }

        public Criteria andAilmentEqualTo(Ailment value) {
            addCriterion("ailment =", value, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentNotEqualTo(Ailment value) {
            addCriterion("ailment <>", value, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentGreaterThan(Ailment value) {
            addCriterion("ailment >", value, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentGreaterThanOrEqualTo(Ailment value) {
            addCriterion("ailment >=", value, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentLessThan(Ailment value) {
            addCriterion("ailment <", value, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentLessThanOrEqualTo(Ailment value) {
            addCriterion("ailment <=", value, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentLike(Ailment value) {
            addCriterion("ailment like", value, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentNotLike(Ailment value) {
            addCriterion("ailment not like", value, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentIn(List<Ailment> values) {
            addCriterion("ailment in", values, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentNotIn(List<Ailment> values) {
            addCriterion("ailment not in", values, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentBetween(Ailment value1, Ailment value2) {
            addCriterion("ailment between", value1, value2, "ailment");
            return (Criteria) this;
        }

        public Criteria andAilmentNotBetween(Ailment value1, Ailment value2) {
            addCriterion("ailment not between", value1, value2, "ailment");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeIsNull() {
            addCriterion("ability_type is null");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeIsNotNull() {
            addCriterion("ability_type is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeEqualTo(AbilityType value) {
            addCriterion("ability_type =", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeNotEqualTo(AbilityType value) {
            addCriterion("ability_type <>", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeGreaterThan(AbilityType value) {
            addCriterion("ability_type >", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeGreaterThanOrEqualTo(AbilityType value) {
            addCriterion("ability_type >=", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeLessThan(AbilityType value) {
            addCriterion("ability_type <", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeLessThanOrEqualTo(AbilityType value) {
            addCriterion("ability_type <=", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeLike(AbilityType value) {
            addCriterion("ability_type like", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeNotLike(AbilityType value) {
            addCriterion("ability_type not like", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeIn(List<AbilityType> values) {
            addCriterion("ability_type in", values, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeNotIn(List<AbilityType> values) {
            addCriterion("ability_type not in", values, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeBetween(AbilityType value1, AbilityType value2) {
            addCriterion("ability_type between", value1, value2, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeNotBetween(AbilityType value1, AbilityType value2) {
            addCriterion("ability_type not between", value1, value2, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueIsNull() {
            addCriterion("ability_control_value is null");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueIsNotNull() {
            addCriterion("ability_control_value is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueEqualTo(Integer value) {
            addCriterion("ability_control_value =", value, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueNotEqualTo(Integer value) {
            addCriterion("ability_control_value <>", value, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueGreaterThan(Integer value) {
            addCriterion("ability_control_value >", value, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("ability_control_value >=", value, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueLessThan(Integer value) {
            addCriterion("ability_control_value <", value, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueLessThanOrEqualTo(Integer value) {
            addCriterion("ability_control_value <=", value, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueIn(List<Integer> values) {
            addCriterion("ability_control_value in", values, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueNotIn(List<Integer> values) {
            addCriterion("ability_control_value not in", values, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueBetween(Integer value1, Integer value2) {
            addCriterion("ability_control_value between", value1, value2, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andAbilityControlValueNotBetween(Integer value1, Integer value2) {
            addCriterion("ability_control_value not between", value1, value2, "abilityControlValue");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidIsNull() {
            addCriterion("skill_other_effectId is null");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidIsNotNull() {
            addCriterion("skill_other_effectId is not null");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidEqualTo(Integer value) {
            addCriterion("skill_other_effectId =", value, "skillOtherEffectid");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidNotEqualTo(Integer value) {
            addCriterion("skill_other_effectId <>", value, "skillOtherEffectid");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidGreaterThan(Integer value) {
            addCriterion("skill_other_effectId >", value, "skillOtherEffectid");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("skill_other_effectId >=", value, "skillOtherEffectid");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidLessThan(Integer value) {
            addCriterion("skill_other_effectId <", value, "skillOtherEffectid");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidLessThanOrEqualTo(Integer value) {
            addCriterion("skill_other_effectId <=", value, "skillOtherEffectid");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidIn(List<Integer> values) {
            addCriterion("skill_other_effectId in", values, "skillOtherEffectid");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidNotIn(List<Integer> values) {
            addCriterion("skill_other_effectId not in", values, "skillOtherEffectid");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidBetween(Integer value1, Integer value2) {
            addCriterion("skill_other_effectId between", value1, value2, "skillOtherEffectid");
            return (Criteria) this;
        }

        public Criteria andSkillOtherEffectidNotBetween(Integer value1, Integer value2) {
            addCriterion("skill_other_effectId not between", value1, value2, "skillOtherEffectid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table skill
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table skill
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}