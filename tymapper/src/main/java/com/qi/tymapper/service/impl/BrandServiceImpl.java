package com.qi.tymapper.service.impl;

import com.qi.tymapper.entity.Brand;
import com.qi.tymapper.mapper.BrandMapper;
import com.qi.tymapper.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-28 9:26
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> queryAll() {
        return brandMapper.selectAll();
    }
}
