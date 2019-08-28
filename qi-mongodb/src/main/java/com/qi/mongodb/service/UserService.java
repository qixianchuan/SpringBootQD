package com.qi.mongodb.service;

import com.qi.mongodb.pojo.User;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 16:51
 * @description：UserService interface
 * @modified By：
 * @version: $version$
 */
public interface UserService {
    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public long updateUser(User user);

    public void deleteUserById(Long id);
}
