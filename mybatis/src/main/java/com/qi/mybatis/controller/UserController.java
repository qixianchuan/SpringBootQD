package com.qi.mybatis.controller;

import com.qi.mybatis.entity.User;
import com.qi.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 11:45
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/list")
    public List<User> findAll() {
        return userMapper.selectAllUser();
    }
}
