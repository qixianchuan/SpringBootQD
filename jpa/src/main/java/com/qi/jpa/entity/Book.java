package com.qi.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 13:57
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Entity
public class Book implements Serializable {

    /**主键**/
    @Id
    @GeneratedValue
    private Long id;
    /**名称**/
    private String name;
    /**作者**/
    private String writer;
    /**简介**/
    private String introduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
