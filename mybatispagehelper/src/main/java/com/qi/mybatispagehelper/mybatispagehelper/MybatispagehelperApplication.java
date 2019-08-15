package com.qi.mybatispagehelper.mybatispagehelper;

import com.qi.mybatispagehelper.mybatispagehelper.entity.Student;
import com.qi.mybatispagehelper.mybatispagehelper.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@Slf4j
@MapperScan("com.qi.mybatispagehelper.mybatispagehelper.mapper")
public class MybatispagehelperApplication implements ApplicationRunner {

    @Autowired
    private StudentMapper studentMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatispagehelperApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Student> allWithParam = studentMapper.findAllWithParam(2, 2);
        log.info("______________");
        log.info(allWithParam + "");
    }
}
