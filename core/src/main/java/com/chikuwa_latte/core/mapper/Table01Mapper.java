package com.chikuwa_latte.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chikuwa_latte.core.entity.master.Table01;

import lombok.NonNull;

@Mapper
public interface Table01Mapper {
    public Table01 find(long userId);

    public List<Table01> findAll();

    public void create(long userId, @NonNull String memo);

    public void update(long userId, @NonNull String memo);
}
