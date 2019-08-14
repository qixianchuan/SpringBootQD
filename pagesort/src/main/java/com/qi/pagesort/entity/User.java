package com.qi.pagesort.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 15:56
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    /**primary key**/
    private Long id;

    private String name;

    private Integer age;

    private String birthday;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
