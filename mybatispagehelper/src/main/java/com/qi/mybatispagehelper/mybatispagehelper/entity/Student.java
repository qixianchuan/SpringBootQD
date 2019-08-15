package com.qi.mybatispagehelper.mybatispagehelper.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-15 13:28
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private Long id;
    private String name;
    private String hobby;
}
