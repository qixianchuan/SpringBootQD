package com.qi.swagger.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 17:14
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Data
@ApiModel(value = "user domain", description = "User Entity")
@Entity
public class User implements Serializable {

    /**
     * primary key
     **/
    @Id
    @GeneratedValue
    private Integer id;
    /****/
    private String name;
    /****/
    private String job;


}
