package com.chikuwa_latte.core.entity.db_master;

import com.chikuwa_latte.core.constant.AttributeType;
import java.io.Serializable;

public class Monster implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.monster_name
     *
     * @mbg.generated
     */
    private String monsterName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.attribute_type
     *
     * @mbg.generated
     */
    private AttributeType attributeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.attribute_type_2
     *
     * @mbg.generated
     */
    private String attributeType2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.capability_id
     *
     * @mbg.generated
     */
    private Integer capabilityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.hp
     *
     * @mbg.generated
     */
    private Integer hp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.attack
     *
     * @mbg.generated
     */
    private Integer attack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.defense
     *
     * @mbg.generated
     */
    private Integer defense;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.special_attack
     *
     * @mbg.generated
     */
    private Integer specialAttack;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.special_defense
     *
     * @mbg.generated
     */
    private Integer specialDefense;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monster.speed
     *
     * @mbg.generated
     */
    private Integer speed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table monster
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    public Monster(Integer id, String monsterName, AttributeType attributeType, String attributeType2, Integer capabilityId, Integer hp, Integer attack, Integer defense, Integer specialAttack, Integer specialDefense, Integer speed) {
        this.id = id;
        this.monsterName = monsterName;
        this.attributeType = attributeType;
        this.attributeType2 = attributeType2;
        this.capabilityId = capabilityId;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    public Monster() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.id
     *
     * @return the value of monster.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.id
     *
     * @param id the value for monster.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.monster_name
     *
     * @return the value of monster.monster_name
     *
     * @mbg.generated
     */
    public String getMonsterName() {
        return monsterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.monster_name
     *
     * @param monsterName the value for monster.monster_name
     *
     * @mbg.generated
     */
    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.attribute_type
     *
     * @return the value of monster.attribute_type
     *
     * @mbg.generated
     */
    public AttributeType getAttributeType() {
        return attributeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.attribute_type
     *
     * @param attributeType the value for monster.attribute_type
     *
     * @mbg.generated
     */
    public void setAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.attribute_type_2
     *
     * @return the value of monster.attribute_type_2
     *
     * @mbg.generated
     */
    public String getAttributeType2() {
        return attributeType2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.attribute_type_2
     *
     * @param attributeType2 the value for monster.attribute_type_2
     *
     * @mbg.generated
     */
    public void setAttributeType2(String attributeType2) {
        this.attributeType2 = attributeType2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.capability_id
     *
     * @return the value of monster.capability_id
     *
     * @mbg.generated
     */
    public Integer getCapabilityId() {
        return capabilityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.capability_id
     *
     * @param capabilityId the value for monster.capability_id
     *
     * @mbg.generated
     */
    public void setCapabilityId(Integer capabilityId) {
        this.capabilityId = capabilityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.hp
     *
     * @return the value of monster.hp
     *
     * @mbg.generated
     */
    public Integer getHp() {
        return hp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.hp
     *
     * @param hp the value for monster.hp
     *
     * @mbg.generated
     */
    public void setHp(Integer hp) {
        this.hp = hp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.attack
     *
     * @return the value of monster.attack
     *
     * @mbg.generated
     */
    public Integer getAttack() {
        return attack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.attack
     *
     * @param attack the value for monster.attack
     *
     * @mbg.generated
     */
    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.defense
     *
     * @return the value of monster.defense
     *
     * @mbg.generated
     */
    public Integer getDefense() {
        return defense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.defense
     *
     * @param defense the value for monster.defense
     *
     * @mbg.generated
     */
    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.special_attack
     *
     * @return the value of monster.special_attack
     *
     * @mbg.generated
     */
    public Integer getSpecialAttack() {
        return specialAttack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.special_attack
     *
     * @param specialAttack the value for monster.special_attack
     *
     * @mbg.generated
     */
    public void setSpecialAttack(Integer specialAttack) {
        this.specialAttack = specialAttack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.special_defense
     *
     * @return the value of monster.special_defense
     *
     * @mbg.generated
     */
    public Integer getSpecialDefense() {
        return specialDefense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.special_defense
     *
     * @param specialDefense the value for monster.special_defense
     *
     * @mbg.generated
     */
    public void setSpecialDefense(Integer specialDefense) {
        this.specialDefense = specialDefense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monster.speed
     *
     * @return the value of monster.speed
     *
     * @mbg.generated
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monster.speed
     *
     * @param speed the value for monster.speed
     *
     * @mbg.generated
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
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
        Monster other = (Monster) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMonsterName() == null ? other.getMonsterName() == null : this.getMonsterName().equals(other.getMonsterName()))
            && (this.getAttributeType() == null ? other.getAttributeType() == null : this.getAttributeType().equals(other.getAttributeType()))
            && (this.getAttributeType2() == null ? other.getAttributeType2() == null : this.getAttributeType2().equals(other.getAttributeType2()))
            && (this.getCapabilityId() == null ? other.getCapabilityId() == null : this.getCapabilityId().equals(other.getCapabilityId()))
            && (this.getHp() == null ? other.getHp() == null : this.getHp().equals(other.getHp()))
            && (this.getAttack() == null ? other.getAttack() == null : this.getAttack().equals(other.getAttack()))
            && (this.getDefense() == null ? other.getDefense() == null : this.getDefense().equals(other.getDefense()))
            && (this.getSpecialAttack() == null ? other.getSpecialAttack() == null : this.getSpecialAttack().equals(other.getSpecialAttack()))
            && (this.getSpecialDefense() == null ? other.getSpecialDefense() == null : this.getSpecialDefense().equals(other.getSpecialDefense()))
            && (this.getSpeed() == null ? other.getSpeed() == null : this.getSpeed().equals(other.getSpeed()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMonsterName() == null) ? 0 : getMonsterName().hashCode());
        result = prime * result + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        result = prime * result + ((getAttributeType2() == null) ? 0 : getAttributeType2().hashCode());
        result = prime * result + ((getCapabilityId() == null) ? 0 : getCapabilityId().hashCode());
        result = prime * result + ((getHp() == null) ? 0 : getHp().hashCode());
        result = prime * result + ((getAttack() == null) ? 0 : getAttack().hashCode());
        result = prime * result + ((getDefense() == null) ? 0 : getDefense().hashCode());
        result = prime * result + ((getSpecialAttack() == null) ? 0 : getSpecialAttack().hashCode());
        result = prime * result + ((getSpecialDefense() == null) ? 0 : getSpecialDefense().hashCode());
        result = prime * result + ((getSpeed() == null) ? 0 : getSpeed().hashCode());
        return result;
    }
}