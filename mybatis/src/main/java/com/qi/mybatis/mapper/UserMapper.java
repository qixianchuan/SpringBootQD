package com.qi.mybatis.mapper;

import com.qi.mybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 9:39
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Mapper
public interface UserMapper{

    @Select("SELECT * FROM user")
    List<User> selectAllUser();

    @Insert("insert into user (name, address)"
            + "values (#{name}, #{address})")
    @Options(useGeneratedKeys = true)
    int saveUser(User user);
}
