package com.chikuwa_latte.core.mapper.db_user;

import com.chikuwa_latte.core.entity.db_user.Table01;
import com.chikuwa_latte.core.entity.db_user.Table01Example;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Table01Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    long countByExample(Table01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    int deleteByExample(Table01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    int insert(Table01 row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    int insertSelective(Table01 row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    List<Table01> selectByExample(Table01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    Table01 selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") Table01 row, @Param("example") Table01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") Table01 row, @Param("example") Table01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Table01 row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table_01
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Table01 row);
}