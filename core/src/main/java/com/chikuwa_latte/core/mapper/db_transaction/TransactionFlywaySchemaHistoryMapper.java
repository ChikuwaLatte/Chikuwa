package com.chikuwa_latte.core.mapper.db_transaction;

import com.chikuwa_latte.core.entity.db_transaction.TransactionFlywaySchemaHistory;
import com.chikuwa_latte.core.entity.db_transaction.TransactionFlywaySchemaHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TransactionFlywaySchemaHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    long countByExample(TransactionFlywaySchemaHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    int deleteByExample(TransactionFlywaySchemaHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer installedRank);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    int insert(TransactionFlywaySchemaHistory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    int insertSelective(TransactionFlywaySchemaHistory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    List<TransactionFlywaySchemaHistory> selectByExample(TransactionFlywaySchemaHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    TransactionFlywaySchemaHistory selectByPrimaryKey(Integer installedRank);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") TransactionFlywaySchemaHistory row, @Param("example") TransactionFlywaySchemaHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") TransactionFlywaySchemaHistory row, @Param("example") TransactionFlywaySchemaHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TransactionFlywaySchemaHistory row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_flyway_schema_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TransactionFlywaySchemaHistory row);
}