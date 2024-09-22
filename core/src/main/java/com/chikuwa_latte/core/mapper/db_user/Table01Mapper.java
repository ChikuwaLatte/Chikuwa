package com.chikuwa_latte.core.mapper.db_user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.chikuwa_latte.core.entity.db_master.Table01;

import lombok.NonNull;

@Mapper
public interface Table01Mapper {
    public Table01 find(@Param("userId") long userId);

    public List<Table01> findAll();

    public void create(@Param("userId") long userId, @Param("memo") @NonNull String memo);

    public void update(@Param("userId") long userId, @Param("memo") @NonNull String memo);
}
