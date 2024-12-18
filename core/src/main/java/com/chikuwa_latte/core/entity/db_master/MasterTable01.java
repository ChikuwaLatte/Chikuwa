package com.chikuwa_latte.core.entity.db_master;

import java.io.Serializable;

public class MasterTable01 implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column master_table_01.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column master_table_01.value1
     *
     * @mbg.generated
     */
    private String value1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column master_table_01.value2
     *
     * @mbg.generated
     */
    private String value2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column master_table_01.value3
     *
     * @mbg.generated
     */
    private String value3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table master_table_01
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table master_table_01
     *
     * @mbg.generated
     */
    public MasterTable01(Integer id, String value1, String value2, String value3) {
        this.id = id;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table master_table_01
     *
     * @mbg.generated
     */
    public MasterTable01() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column master_table_01.id
     *
     * @return the value of master_table_01.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column master_table_01.id
     *
     * @param id the value for master_table_01.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column master_table_01.value1
     *
     * @return the value of master_table_01.value1
     *
     * @mbg.generated
     */
    public String getValue1() {
        return value1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column master_table_01.value1
     *
     * @param value1 the value for master_table_01.value1
     *
     * @mbg.generated
     */
    public void setValue1(String value1) {
        this.value1 = value1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column master_table_01.value2
     *
     * @return the value of master_table_01.value2
     *
     * @mbg.generated
     */
    public String getValue2() {
        return value2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column master_table_01.value2
     *
     * @param value2 the value for master_table_01.value2
     *
     * @mbg.generated
     */
    public void setValue2(String value2) {
        this.value2 = value2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column master_table_01.value3
     *
     * @return the value of master_table_01.value3
     *
     * @mbg.generated
     */
    public String getValue3() {
        return value3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column master_table_01.value3
     *
     * @param value3 the value for master_table_01.value3
     *
     * @mbg.generated
     */
    public void setValue3(String value3) {
        this.value3 = value3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table master_table_01
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
        MasterTable01 other = (MasterTable01) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getValue1() == null ? other.getValue1() == null : this.getValue1().equals(other.getValue1()))
            && (this.getValue2() == null ? other.getValue2() == null : this.getValue2().equals(other.getValue2()))
            && (this.getValue3() == null ? other.getValue3() == null : this.getValue3().equals(other.getValue3()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table master_table_01
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getValue1() == null) ? 0 : getValue1().hashCode());
        result = prime * result + ((getValue2() == null) ? 0 : getValue2().hashCode());
        result = prime * result + ((getValue3() == null) ? 0 : getValue3().hashCode());
        return result;
    }
}