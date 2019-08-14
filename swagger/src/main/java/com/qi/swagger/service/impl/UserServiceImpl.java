package com.qi.swagger.service.impl;

import com.qi.swagger.common.ApiResponse;
import com.qi.swagger.dao.UserDao;
import com.qi.swagger.entity.User;
import com.qi.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 17:41
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    @Override
    public ApiResponse<User> insertUser(User user) {
        User user1 = userDao.save(user);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(200);
        apiResponse.setMessage("save success");
        apiResponse.setData(user1);
        return apiResponse;
    }
}
