package com.chikuwa_latte.core.entity.db_transaction;

import com.chikuwa_latte.core.constant.BattleStatus;
import com.chikuwa_latte.core.constant.BattleType;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Battle implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column battle.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column battle.battle_type
     *
     * @mbg.generated
     */
    private BattleType battleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column battle.battle_status
     *
     * @mbg.generated
     */
    private BattleStatus battleStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column battle.turn
     *
     * @mbg.generated
     */
    private Integer turn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column battle.created_at
     *
     * @mbg.generated
     */
    private LocalDateTime createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column battle.updated_at
     *
     * @mbg.generated
     */
    private LocalDateTime updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table battle
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    public Battle(String id, BattleType battleType, BattleStatus battleStatus, Integer turn, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.battleType = battleType;
        this.battleStatus = battleStatus;
        this.turn = turn;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    public Battle() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column battle.id
     *
     * @return the value of battle.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column battle.id
     *
     * @param id the value for battle.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column battle.battle_type
     *
     * @return the value of battle.battle_type
     *
     * @mbg.generated
     */
    public BattleType getBattleType() {
        return battleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column battle.battle_type
     *
     * @param battleType the value for battle.battle_type
     *
     * @mbg.generated
     */
    public void setBattleType(BattleType battleType) {
        this.battleType = battleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column battle.battle_status
     *
     * @return the value of battle.battle_status
     *
     * @mbg.generated
     */
    public BattleStatus getBattleStatus() {
        return battleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column battle.battle_status
     *
     * @param battleStatus the value for battle.battle_status
     *
     * @mbg.generated
     */
    public void setBattleStatus(BattleStatus battleStatus) {
        this.battleStatus = battleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column battle.turn
     *
     * @return the value of battle.turn
     *
     * @mbg.generated
     */
    public Integer getTurn() {
        return turn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column battle.turn
     *
     * @param turn the value for battle.turn
     *
     * @mbg.generated
     */
    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column battle.created_at
     *
     * @return the value of battle.created_at
     *
     * @mbg.generated
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column battle.created_at
     *
     * @param createdAt the value for battle.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column battle.updated_at
     *
     * @return the value of battle.updated_at
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column battle.updated_at
     *
     * @param updatedAt the value for battle.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Battle other = (Battle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBattleType() == null ? other.getBattleType() == null : this.getBattleType().equals(other.getBattleType()))
            && (this.getBattleStatus() == null ? other.getBattleStatus() == null : this.getBattleStatus().equals(other.getBattleStatus()))
            && (this.getTurn() == null ? other.getTurn() == null : this.getTurn().equals(other.getTurn()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table battle
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBattleType() == null) ? 0 : getBattleType().hashCode());
        result = prime * result + ((getBattleStatus() == null) ? 0 : getBattleStatus().hashCode());
        result = prime * result + ((getTurn() == null) ? 0 : getTurn().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}