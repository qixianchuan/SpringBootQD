package com.qi.war.mapper;

import com.qi.war.domain.ChasesunEdiOrderReceiptMain;
import com.qi.war.domain.ChasesunEdiOrderReceiptMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-09-04 13:26
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Mapper
public interface ChasesunEdiOrderReceiptMainMapper {
    long countByExample(ChasesunEdiOrderReceiptMainExample example);

    int deleteByExample(ChasesunEdiOrderReceiptMainExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChasesunEdiOrderReceiptMain record);

    int insertOrUpdate(ChasesunEdiOrderReceiptMain record);

    int insertOrUpdateSelective(ChasesunEdiOrderReceiptMain record);

    int insertSelective(ChasesunEdiOrderReceiptMain record);

    List<ChasesunEdiOrderReceiptMain> selectByExample(ChasesunEdiOrderReceiptMainExample example);

    ChasesunEdiOrderReceiptMain selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChasesunEdiOrderReceiptMain record, @Param("example") ChasesunEdiOrderReceiptMainExample example);

    int updateByExample(@Param("record") ChasesunEdiOrderReceiptMain record, @Param("example") ChasesunEdiOrderReceiptMainExample example);

    int updateByPrimaryKeySelective(ChasesunEdiOrderReceiptMain record);

    int updateByPrimaryKey(ChasesunEdiOrderReceiptMain record);

    int updateBatch(List<ChasesunEdiOrderReceiptMain> list);

    int batchInsert(@Param("list") List<ChasesunEdiOrderReceiptMain> list);
}