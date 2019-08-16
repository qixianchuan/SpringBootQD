package com.qi.mybatisplus.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 9:28
 * @description：Person Entity
 * @modified By：
 * @version: $version$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Serializable {

    private static final long serialVersionUID = -791770921583210547L;

    private Long id;

    private String name;

    private String email;
}
