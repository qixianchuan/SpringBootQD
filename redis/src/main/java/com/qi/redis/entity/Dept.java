package com.qi.redis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 15:15
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Data
public class Dept implements Serializable {

    private static final long serialVersionUID = 8783264431209514269L;

    private Long id;

    private String dname;

    private String loc;
}
