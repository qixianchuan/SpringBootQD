package com.qi.swagger.dao;


import com.qi.swagger.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 17:25
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface UserDao extends JpaRepository<User, Integer> {
}
