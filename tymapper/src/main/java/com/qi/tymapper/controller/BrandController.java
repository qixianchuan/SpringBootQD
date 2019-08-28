package com.qi.tymapper.controller;

import com.qi.tymapper.entity.Brand;
import com.qi.tymapper.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-28 9:28
 * @description：BrandController
 * @modified By：
 * @version: $version$
 */
@Controller
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("all")
    @ResponseBody
    public List<Brand> findAll() {
        return brandService.queryAll();
    }

}
