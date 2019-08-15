package com.qi.mybatis;

import com.qi.mybatis.entity.User;
import com.qi.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qi.mybatis.mapper")
@Slf4j
public class MybatisApplication implements ApplicationRunner {
    @Autowired
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = User.builder().name("qqq")
                .address("td").build();
        int count = userMapper.saveUser(user);
        log.info("Save {} User: {}", count, user);
    }
}
