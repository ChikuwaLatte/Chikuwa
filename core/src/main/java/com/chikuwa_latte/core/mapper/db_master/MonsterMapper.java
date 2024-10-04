package com.chikuwa_latte.core.mapper.db_master;

import com.chikuwa_latte.core.entity.db_master.Monster;
import com.chikuwa_latte.core.entity.db_master.MonsterExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MonsterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    long countByExample(MonsterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    int deleteByExample(MonsterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    int insert(Monster row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    int insertSelective(Monster row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    List<Monster> selectByExample(MonsterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    Monster selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") Monster row, @Param("example") MonsterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") Monster row, @Param("example") MonsterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Monster row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monster
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Monster row);
}