package com.chikuwa_latte.core.entity.db_transaction;

import com.chikuwa_latte.core.constant.BattleStatus;
import com.chikuwa_latte.core.constant.BattleType;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BattleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table battle
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table battle
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table battle
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    public BattleExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
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
     * This method corresponds to the database table battle
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
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
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
     * This class corresponds to the database table battle
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBattleTypeIsNull() {
            addCriterion("battle_type is null");
            return (Criteria) this;
        }

        public Criteria andBattleTypeIsNotNull() {
            addCriterion("battle_type is not null");
            return (Criteria) this;
        }

        public Criteria andBattleTypeEqualTo(BattleType value) {
            addCriterion("battle_type =", value, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeNotEqualTo(BattleType value) {
            addCriterion("battle_type <>", value, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeGreaterThan(BattleType value) {
            addCriterion("battle_type >", value, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeGreaterThanOrEqualTo(BattleType value) {
            addCriterion("battle_type >=", value, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeLessThan(BattleType value) {
            addCriterion("battle_type <", value, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeLessThanOrEqualTo(BattleType value) {
            addCriterion("battle_type <=", value, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeLike(BattleType value) {
            addCriterion("battle_type like", value, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeNotLike(BattleType value) {
            addCriterion("battle_type not like", value, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeIn(List<BattleType> values) {
            addCriterion("battle_type in", values, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeNotIn(List<BattleType> values) {
            addCriterion("battle_type not in", values, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeBetween(BattleType value1, BattleType value2) {
            addCriterion("battle_type between", value1, value2, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleTypeNotBetween(BattleType value1, BattleType value2) {
            addCriterion("battle_type not between", value1, value2, "battleType");
            return (Criteria) this;
        }

        public Criteria andBattleStatusIsNull() {
            addCriterion("battle_status is null");
            return (Criteria) this;
        }

        public Criteria andBattleStatusIsNotNull() {
            addCriterion("battle_status is not null");
            return (Criteria) this;
        }

        public Criteria andBattleStatusEqualTo(BattleStatus value) {
            addCriterion("battle_status =", value, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusNotEqualTo(BattleStatus value) {
            addCriterion("battle_status <>", value, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusGreaterThan(BattleStatus value) {
            addCriterion("battle_status >", value, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusGreaterThanOrEqualTo(BattleStatus value) {
            addCriterion("battle_status >=", value, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusLessThan(BattleStatus value) {
            addCriterion("battle_status <", value, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusLessThanOrEqualTo(BattleStatus value) {
            addCriterion("battle_status <=", value, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusLike(BattleStatus value) {
            addCriterion("battle_status like", value, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusNotLike(BattleStatus value) {
            addCriterion("battle_status not like", value, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusIn(List<BattleStatus> values) {
            addCriterion("battle_status in", values, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusNotIn(List<BattleStatus> values) {
            addCriterion("battle_status not in", values, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusBetween(BattleStatus value1, BattleStatus value2) {
            addCriterion("battle_status between", value1, value2, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andBattleStatusNotBetween(BattleStatus value1, BattleStatus value2) {
            addCriterion("battle_status not between", value1, value2, "battleStatus");
            return (Criteria) this;
        }

        public Criteria andTurnIsNull() {
            addCriterion("turn is null");
            return (Criteria) this;
        }

        public Criteria andTurnIsNotNull() {
            addCriterion("turn is not null");
            return (Criteria) this;
        }

        public Criteria andTurnEqualTo(Integer value) {
            addCriterion("turn =", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnNotEqualTo(Integer value) {
            addCriterion("turn <>", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnGreaterThan(Integer value) {
            addCriterion("turn >", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnGreaterThanOrEqualTo(Integer value) {
            addCriterion("turn >=", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnLessThan(Integer value) {
            addCriterion("turn <", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnLessThanOrEqualTo(Integer value) {
            addCriterion("turn <=", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnIn(List<Integer> values) {
            addCriterion("turn in", values, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnNotIn(List<Integer> values) {
            addCriterion("turn not in", values, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnBetween(Integer value1, Integer value2) {
            addCriterion("turn between", value1, value2, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnNotBetween(Integer value1, Integer value2) {
            addCriterion("turn not between", value1, value2, "turn");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(LocalDateTime value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(LocalDateTime value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(LocalDateTime value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(LocalDateTime value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<LocalDateTime> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<LocalDateTime> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(LocalDateTime value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(LocalDateTime value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(LocalDateTime value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(LocalDateTime value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<LocalDateTime> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<LocalDateTime> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table battle
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
     * This class corresponds to the database table battle
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