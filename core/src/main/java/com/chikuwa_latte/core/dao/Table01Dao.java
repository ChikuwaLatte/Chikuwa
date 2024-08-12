package com.chikuwa_latte.core.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chikuwa_latte.core.entity.master.Table01;
import com.chikuwa_latte.core.mapper.Table01Mapper;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class Table01Dao {
    private final Table01Mapper table01Mapper;

    public Table01 find(long userId) {
        return table01Mapper.find(userId);
    }

    public List<Table01> findAll() {
        return table01Mapper.findAll();
    }

    public void create(long userId, @NonNull String memo) {
        table01Mapper.create(userId, memo);
    }

    public void update(long userId, @NonNull String memo) {
        table01Mapper.update(userId, memo);
    }
}
