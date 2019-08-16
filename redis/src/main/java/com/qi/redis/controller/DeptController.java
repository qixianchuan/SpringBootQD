package com.qi.redis.controller;

import com.qi.redis.entity.Dept;
import com.qi.redis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 17:32
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/findAll")
    public List<Dept> findAll() {
        return deptService.findAllDept();
    }

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public Dept findById(@PathVariable("id") Long id) {
        return deptService.findById(id);
    }
}
