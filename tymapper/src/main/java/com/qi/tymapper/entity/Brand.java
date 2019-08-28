package com.qi.tymapper.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-27 17:40
 * @description：Brand entity
 * @modified By：
 * @version: $version$
 */
@Data
@Table(name = "tb_brand")
public class Brand implements Serializable {

    private static final long serialVersionUID = 4418792683289989995L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 品牌名称
     */
    private String name;
    /**
     * 品牌图片
     */
    private String image;
    private Character letter;
}
