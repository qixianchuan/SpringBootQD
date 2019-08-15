package com.qi.mybatispagehelper.mybatispagehelper.mapper;

import com.qi.mybatispagehelper.mybatispagehelper.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 13:29
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Mapper
public interface StudentMapper {


    @Select("select * from student order by id")
    List<Student> findAllWithParam(@Param("pageNum") int pageNum,
                                   @Param("pageSize") int pageSize);
}
