package com.qi.redis.service;

import com.qi.redis.entity.Dept;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 17:26
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface DeptService {
    List<Dept> findAllDept();

    Dept findById(Long id);
}
