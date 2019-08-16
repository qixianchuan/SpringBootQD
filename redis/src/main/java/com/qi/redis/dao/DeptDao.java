package com.qi.redis.dao;

import com.qi.redis.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 17:20
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface DeptDao {

    List<Dept> findAllDept();

    Dept findById(@Param("id") Long id);
}
