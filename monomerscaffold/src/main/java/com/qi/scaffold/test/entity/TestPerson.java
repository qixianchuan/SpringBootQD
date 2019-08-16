package com.qi.scaffold.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 14:43
 * @description：TestPerson Entity
 * @modified By：
 * @version: $version$
 */
@Data
@TableName("TestPerson")
@Builder
public class TestPerson implements Serializable {

    private static final long serialVersionUID = -6295641226142442434L;

    private Long id;

    private String name;

    private String sex;


}
