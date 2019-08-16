package com.qi.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qi.mybatisplus.entity.Person;
import com.qi.mybatisplus.mapper.PersonMapper;
import com.qi.mybatisplus.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 9:38
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping(value = "person")
@Slf4j
public class PersonController {
    @Autowired
    private PersonService personService;
    @Autowired
    private PersonMapper personMapper;

    @RequestMapping(value = "/findAll")
    public List<Person> findAll() {
        return personService.list();
    }

    @RequestMapping(value = "/findPage")
    public IPage<Person> findPage(@RequestParam(value = "current", required = true) Long current, @RequestParam(value = "size", required = true) Long size) {
        Page<Person> page = new Page<>(current, size);
        IPage<Person> result = personMapper.selectPage(page, new QueryWrapper<Person>().isNotNull("name"));
        log.info("总条数 ------> " + result.getTotal());
        log.info("当前页数 ------> " + result.getCurrent());
        log.info("当前每页显示数 ------> " + result.getSize());
        print(result.getRecords());
        return result;
    }

    @RequestMapping(value = "/findPersonByPage/{current}/{size}")
    public IPage<Person> findPersonByPage(@PathVariable Long current,@PathVariable Long size){
        Page<Person> page = new Page<>(current, size);
        IPage<Person> result = personMapper.selectPage(page, new QueryWrapper<Person>().isNotNull("email").isNotNull("name"));
        log.info("总条数 ------> " + result.getTotal());
        log.info("当前页数 ------> " + result.getCurrent());
        log.info("当前每页显示数 ------> " + result.getSize());
        print(result.getRecords());
        return result;
    }

    @RequestMapping(value = "/findById/{id}")
    public Person findById(@PathVariable Long id) {
        return personService.getById(id);
    }

    //根据姓名查询 模糊搜索
    @RequestMapping(value = "/findPersonByName/{name}")
    public List<Person> findPersonByName(@PathVariable String name) {
        List<Person> personList = personService.list(new QueryWrapper<Person>()
                .lambda().like(Person::getName, name)
        );
        return personList;
    }

    //根据邮箱查询 模糊搜索
    @RequestMapping(value = "/findPersonByEmail/{email}")
    public List<Person> findPersonByEmail(@PathVariable String email){
        List<Person> personList = personService.list(new QueryWrapper<Person>()
                .lambda().like(Person::getEmail, email)
        );
        return personList;
    }

    @RequestMapping(value = "/getCount")
    public int getCount() {
        int count = personService.count();
        return count;
    }

    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public void addPerson(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "email", required = true) String email) {
        Person person = Person.builder().name(name).email(email).build();
        personService.save(person);
        log.info("【测试id回显#person.getId()】= {}", person.getId());
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public void deleteById(@RequestParam(value = "id", required = true) Long id) {
        boolean isRemove = personService.removeById(id);
        log.info("【测试id号为{}的数据是否被删除】= {}", id, isRemove);
    }

    @RequestMapping(value = "/saveOrUpdatePerson", method = RequestMethod.POST)
    public void saveOrUpdatePerson(@RequestParam(value = "id", required = false) Long id, @RequestParam(value = "name", required = true) String name, @RequestParam(value = "email", required = true) String email) {
        Person person = Person.builder().id(id).name(name).email(email).build();
        boolean saveOrUpdate = personService.saveOrUpdate(person);
        log.info("【测试id号为{}的数据是否被新增或者修改】= {}", person.getId(), saveOrUpdate);
    }

    private <T> void print(List<T> list) {
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(System.out::println);
        }
    }
}
