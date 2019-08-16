package com.qi.scaffold.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qi.scaffold.common.result.GlobalErrorInfoException;
import com.qi.scaffold.common.result.ResultBody;
import com.qi.scaffold.common.result.TestPersonErrorInfoEnum;
import com.qi.scaffold.test.entity.TestPerson;
import com.qi.scaffold.test.mapper.TestPersonMapper;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
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
    public ResultBody findAll() {
        ResultBody resultBody = new ResultBody(testPersonMapper.selectList(null));
        return resultBody;
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public ResultBody findById(@RequestParam(value = "id", required = false) Long id) throws GlobalErrorInfoException {
        if (id == null) {
            throw new GlobalErrorInfoException(TestPersonErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        List<TestPerson> personList = testPersonMapper.selectList(new QueryWrapper<TestPerson>().eq("id", id));
        if (CollectionUtils.isEmpty(personList)) {
            throw new GlobalErrorInfoException(TestPersonErrorInfoEnum.NO_DATA_WAS_QUERIED);
        }
        return new ResultBody(personList.get(0));
    }

    @RequestMapping(value = "/addOne", method = RequestMethod.POST)
    public ResultBody addOne(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "sex", required = false) String sex) throws GlobalErrorInfoException {
        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(sex)) {
            throw new GlobalErrorInfoException(TestPersonErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        TestPerson testPerson = TestPerson.builder().name(name).sex(sex).build();
        int insert = testPersonMapper.insert(testPerson);
        log.info("有" + insert + "个testPerson实体被新增。");
        return new ResultBody("新增成功");
    }

    @RequestMapping(value = "/deleteOne", method = RequestMethod.POST)
    public ResultBody deleteOne(@RequestParam(value = "id", required = false) Long id) throws GlobalErrorInfoException {
        if (id == null) {
            throw new GlobalErrorInfoException(TestPersonErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        int delete = testPersonMapper.deleteById(id);
        log.info("有" + delete + "个testPerson实体被删除。");
        return new ResultBody("删除成功");
    }

    @RequestMapping(value = "/updateOne", method = RequestMethod.POST)
    public ResultBody updateOne(@RequestParam(value = "id", required = false) Long id, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "sex", required = false) String sex) throws GlobalErrorInfoException {
        if (id == null || StringUtils.isEmpty(name) || StringUtils.isEmpty(sex)) {
            throw new GlobalErrorInfoException(TestPersonErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        TestPerson testPerson = TestPerson.builder().id(id).name(name).sex(sex).build();
        int update = testPersonMapper.update(testPerson, new QueryWrapper<TestPerson>().eq("id", id));
        log.info("有" + update + "个testPerson实体被修改。");
        return new ResultBody("修改成功");
    }

}
