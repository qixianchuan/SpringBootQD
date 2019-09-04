package com.qi.war.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.qi.war.domain.ChasesunEdiOrderReceiptMain;
import com.qi.war.domain.ChasesunEdiOrderReceiptMainExample;
import com.qi.war.mapper.ChasesunEdiOrderReceiptMainMapper;
import com.qi.war.service.ChasesunEdiOrderReceiptMainService;
/**
 * @author     ：qixianchuan
 * @date       ：Created in 2019-09-04 13:26
 * @description：${description}
 * @modified By：
 * @version:     $version$
 */
@Service
public class ChasesunEdiOrderReceiptMainServiceImpl implements ChasesunEdiOrderReceiptMainService{

    @Resource
    private ChasesunEdiOrderReceiptMainMapper chasesunEdiOrderReceiptMainMapper;

    @Override
    public long countByExample(ChasesunEdiOrderReceiptMainExample example) {
        return chasesunEdiOrderReceiptMainMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ChasesunEdiOrderReceiptMainExample example) {
        return chasesunEdiOrderReceiptMainMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return chasesunEdiOrderReceiptMainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ChasesunEdiOrderReceiptMain record) {
        return chasesunEdiOrderReceiptMainMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(ChasesunEdiOrderReceiptMain record) {
        return chasesunEdiOrderReceiptMainMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(ChasesunEdiOrderReceiptMain record) {
        return chasesunEdiOrderReceiptMainMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(ChasesunEdiOrderReceiptMain record) {
        return chasesunEdiOrderReceiptMainMapper.insertSelective(record);
    }

    @Override
    public List<ChasesunEdiOrderReceiptMain> selectByExample(ChasesunEdiOrderReceiptMainExample example) {
        return chasesunEdiOrderReceiptMainMapper.selectByExample(example);
    }

    @Override
    public ChasesunEdiOrderReceiptMain selectByPrimaryKey(String id) {
        return chasesunEdiOrderReceiptMainMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ChasesunEdiOrderReceiptMain record,ChasesunEdiOrderReceiptMainExample example) {
        return chasesunEdiOrderReceiptMainMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ChasesunEdiOrderReceiptMain record,ChasesunEdiOrderReceiptMainExample example) {
        return chasesunEdiOrderReceiptMainMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ChasesunEdiOrderReceiptMain record) {
        return chasesunEdiOrderReceiptMainMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ChasesunEdiOrderReceiptMain record) {
        return chasesunEdiOrderReceiptMainMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ChasesunEdiOrderReceiptMain> list) {
        return chasesunEdiOrderReceiptMainMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ChasesunEdiOrderReceiptMain> list) {
        return chasesunEdiOrderReceiptMainMapper.batchInsert(list);
    }

}
