package com.qi.scaffold.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qi.scaffold.test.entity.TestPerson;
import com.qi.scaffold.test.mapper.TestPersonMapper;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 14:49
 * @description：TestPersonController
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping(value = "testPerson")
@Slf4j
@Api(tags = "Person manager", description = "Person manager", value = "Person manager")
public class TestPersonController {
    @Autowired
    private TestPersonMapper testPersonMapper;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<TestPerson> findAll() {
        return testPersonMapper.selectList(null);
    }

    @RequestMapping(value = "/addOne", method = RequestMethod.POST)
    public void addOne(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "sex", required = true) String sex) {
        TestPerson testPerson = TestPerson.builder().name(name).sex(sex).build();
        int insert = testPersonMapper.insert(testPerson);
        log.info("有" + insert + "个testPerson实体被新增。");
    }

    @RequestMapping(value = "/deleteOne", method = RequestMethod.POST)
    public void deleteOne(@RequestParam(value = "id", required = true) Long id) {
        int delete = testPersonMapper.deleteById(id);
        log.info("有" + delete + "个testPerson实体被删除。");
    }

    @RequestMapping(value = "/updateOne", method = RequestMethod.POST)
    public void updateOne(@RequestParam(value = "id", required = true) Long id, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "sex", required = false) String sex) {
        TestPerson testPerson = TestPerson.builder().id(id).name(name).sex(sex).build();
        int update = testPersonMapper.update(testPerson, new QueryWrapper<TestPerson>().eq("id",id ));
        log.info("有" + update + "个testPerson实体被修改。");
    }


}
