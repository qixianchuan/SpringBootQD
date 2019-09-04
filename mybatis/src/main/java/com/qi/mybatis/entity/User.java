package com.qi.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 9:36
 * @description：User entity
 * @modified By：
 * @version: $version$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private Long id;

    private String name;

    private String address;

}
