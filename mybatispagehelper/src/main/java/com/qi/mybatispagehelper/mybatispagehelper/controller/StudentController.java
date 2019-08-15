package com.qi.mybatispagehelper.mybatispagehelper.controller;

import com.qi.mybatispagehelper.mybatispagehelper.entity.Student;
import com.qi.mybatispagehelper.mybatispagehelper.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 13:40
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping(value = "student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping(value = "/findByPage/{pageNum}/{pageSize}")
    public List<Student> findByPage(@PathVariable int pageNum, @PathVariable int pageSize) {
        return studentMapper.findAllWithParam(pageNum, pageSize);
    }
}
