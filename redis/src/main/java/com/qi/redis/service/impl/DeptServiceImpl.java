package com.qi.redis.service.impl;

import com.qi.redis.dao.DeptDao;
import com.qi.redis.entity.Dept;
import com.qi.redis.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 17:29
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service
public class DeptServiceImpl implements DeptService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeptServiceImpl.class);

    @Autowired
    private DeptDao deptDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<Dept> findAllDept() {
        return deptDao.findAllDept();
    }

    @Override
    public Dept findById(Long id) {
        String key = "dept_" + id;
        ValueOperations<String, Dept> operations = redisTemplate.opsForValue();

        Boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            Dept dept = operations.get(key);
            LOGGER.info("DeptServiceImpl.findById() : getfromRedis >> " + dept.toString());
            return dept;
        }

        Dept dept = deptDao.findById(id);
        operations.set(key, dept);
        LOGGER.info("DeptServiceImpl.findById() : toRedis >> " + dept.toString());
        return dept;
    }


}
