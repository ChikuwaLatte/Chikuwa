package com.chikuwa_latte.core.repository.db_user;

import org.springframework.stereotype.Repository;

import com.chikuwa_latte.core.entity.db_user.User;
import com.chikuwa_latte.core.mapper.db_user.UserMapper;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDao {
    private final UserMapper userMapper;

    public User find(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public void create(@NonNull User user) {
        userMapper.insert(user);
    }
}
