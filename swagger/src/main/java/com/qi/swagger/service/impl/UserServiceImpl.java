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
    public ApiResponse<List<User>> findAllUser() {
        List<User> userList = userDao.findAll();
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(200);
        apiResponse.setMessage("select success");
        apiResponse.setData(userList);
        return apiResponse;
    }

    @Override
    public ApiResponse insertUser(User user) {
        User user1 = userDao.save(user);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(200);
        apiResponse.setMessage("save success");
        return apiResponse;
    }

    @Override
    public ApiResponse updateUser(User user) {
        userDao.save(user);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(200);
        apiResponse.setMessage("update success");
        return apiResponse;
    }

    @Override
    public ApiResponse deleteUser(Integer id) {
        userDao.deleteById(id);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(200);
        apiResponse.setMessage("delete success");
        return apiResponse;
    }
}
