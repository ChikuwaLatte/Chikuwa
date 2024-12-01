package com.chikuwa_latte.core.repository.db_master;

import org.springframework.stereotype.Repository;

import com.chikuwa_latte.core.entity.db_master.Skill;
import com.chikuwa_latte.core.mapper.db_master.SkillMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SkillDao {
    private final SkillMapper skillMapper;

    public Skill find(int id) {
        return skillMapper.selectByPrimaryKey(id);
    }
}
