package com.qi.tymapper.mapper;

import com.qi.tymapper.entity.Brand;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-27 17:44
 * @description：BrandMapper interface
 * @modified By：
 * @version: $version$
 */

@org.apache.ibatis.annotations.Mapper
public interface BrandMapper extends Mapper<Brand>, SelectByIdListMapper<Brand,Long> {

}
