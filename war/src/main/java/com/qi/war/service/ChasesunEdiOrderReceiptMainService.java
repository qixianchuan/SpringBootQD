package com.qi.war.service;

import java.util.List;
import com.qi.war.domain.ChasesunEdiOrderReceiptMain;
import com.qi.war.domain.ChasesunEdiOrderReceiptMainExample;
    /**
 * @author     ：qixianchuan
 * @date       ：Created in 2019-09-04 13:26
 * @description：${description}
 * @modified By：
 * @version:     $version$
 */
public interface ChasesunEdiOrderReceiptMainService{


    long countByExample(ChasesunEdiOrderReceiptMainExample example);

    int deleteByExample(ChasesunEdiOrderReceiptMainExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChasesunEdiOrderReceiptMain record);

    int insertOrUpdate(ChasesunEdiOrderReceiptMain record);

    int insertOrUpdateSelective(ChasesunEdiOrderReceiptMain record);

    int insertSelective(ChasesunEdiOrderReceiptMain record);

    List<ChasesunEdiOrderReceiptMain> selectByExample(ChasesunEdiOrderReceiptMainExample example);

    ChasesunEdiOrderReceiptMain selectByPrimaryKey(String id);

    int updateByExampleSelective(ChasesunEdiOrderReceiptMain record,ChasesunEdiOrderReceiptMainExample example);

    int updateByExample(ChasesunEdiOrderReceiptMain record,ChasesunEdiOrderReceiptMainExample example);

    int updateByPrimaryKeySelective(ChasesunEdiOrderReceiptMain record);

    int updateByPrimaryKey(ChasesunEdiOrderReceiptMain record);

    int updateBatch(List<ChasesunEdiOrderReceiptMain> list);

    int batchInsert(List<ChasesunEdiOrderReceiptMain> list);

}
