package com.qi.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qi.mybatisplus.entity.Person;
import com.qi.mybatisplus.mapper.PersonMapper;
import com.qi.mybatisplus.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 9:31
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {
}
