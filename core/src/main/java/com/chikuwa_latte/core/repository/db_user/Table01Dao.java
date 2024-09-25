package com.chikuwa_latte.core.repository.db_user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chikuwa_latte.core.entity.db_user.Table01;
import com.chikuwa_latte.core.entity.db_user.Table01Example;
import com.chikuwa_latte.core.mapper.db_user.Table01Mapper;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class Table01Dao {
    private final Table01Mapper table01Mapper;

    public Table01 find(long userId) {
        return table01Mapper.selectByPrimaryKey(userId);
    }

    public List<Table01> findAll(long userId) {
        Table01Example example = new Table01Example();
        example.createCriteria().andUserIdEqualTo(userId);
        return table01Mapper.selectByExample(example);
    }

    public void create(long userId, @NonNull String memo) {
        Table01 entity = new Table01(userId, memo);
        table01Mapper.insert(entity);
    }

    public void update(long userId, @NonNull String memo) {
        Table01 entity = new Table01(userId, memo);
        table01Mapper.updateByPrimaryKey(entity);
    }
}
