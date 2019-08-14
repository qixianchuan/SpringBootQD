package com.qi.swagger.service;

import com.qi.swagger.common.ApiResponse;
import com.qi.swagger.entity.User;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 17:27
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface UserService {

    ApiResponse<List<User>> findAllUser();

    ApiResponse insertUser(User user);

    ApiResponse updateUser(User user);

    ApiResponse deleteUser(Integer id);
}
