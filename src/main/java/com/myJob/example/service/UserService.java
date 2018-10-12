package com.myJob.example.service;

import com.myJob.example.entity.User;
import com.myJob.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: dxjx
 * @description:
 * @date: 2018/10/11
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int insert(String name, Integer age) {
        int result = userMapper.insert(name, age);
        System.out.println(1 / 0);
        return result;
    }

    public User findById(Long id) {
        return userMapper.findById(id);
    }
}
