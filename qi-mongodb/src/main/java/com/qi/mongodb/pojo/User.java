package com.qi.mongodb.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 16:48
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1468286669796355340L;
    private Long id;
    private String userName;
    private String passWord;
}
