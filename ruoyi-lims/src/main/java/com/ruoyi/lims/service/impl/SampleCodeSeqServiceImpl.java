package com.ruoyi.lims.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.SampleCodeSeqMapper;
import com.ruoyi.lims.domain.SampleCodeSeq;
import com.ruoyi.lims.service.ISampleCodeSeqService;

/**
 * 样品编码序列Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
@Service
public class SampleCodeSeqServiceImpl implements ISampleCodeSeqService {
    @Autowired
    private SampleCodeSeqMapper sampleCodeSeqMapper;

    /**
     * 查询样品编码序列
     * 
     * @param seqId 样品编码序列主键
     * @return 样品编码序列
     */
    @Override
    public SampleCodeSeq selectSampleCodeSeqBySeqId(Long seqId) {
        return sampleCodeSeqMapper.selectSampleCodeSeqBySeqId(seqId);
    }

    /**
     * 查询样品编码序列列表
     * 
     * @param sampleCodeSeq 样品编码序列
     * @return 样品编码序列
     */
    @Override
    public List<SampleCodeSeq> selectSampleCodeSeqList(SampleCodeSeq sampleCodeSeq) {
        return sampleCodeSeqMapper.selectSampleCodeSeqList(sampleCodeSeq);
    }

    /**
     * 新增样品编码序列
     * 
     * @param sampleCodeSeq 样品编码序列
     * @return 结果
     */
    @Override
    public int insertSampleCodeSeq(SampleCodeSeq sampleCodeSeq) {
        sampleCodeSeq.setCreateTime(DateUtils.getNowDate());
        return sampleCodeSeqMapper.insertSampleCodeSeq(sampleCodeSeq);
    }

    /**
     * 修改样品编码序列
     * 
     * @param sampleCodeSeq 样品编码序列
     * @return 结果
     */
    @Override
    public int updateSampleCodeSeq(SampleCodeSeq sampleCodeSeq) {
        sampleCodeSeq.setUpdateTime(DateUtils.getNowDate());
        return sampleCodeSeqMapper.updateSampleCodeSeq(sampleCodeSeq);
    }

    /**
     * 批量删除样品编码序列
     * 
     * @param seqIds 需要删除的样品编码序列主键
     * @return 结果
     */
    @Override
    public int deleteSampleCodeSeqBySeqIds(Long[] seqIds) {
        return sampleCodeSeqMapper.deleteSampleCodeSeqBySeqIds(seqIds);
    }

    /**
     * 删除样品编码序列信息
     * 
     * @param seqId 样品编码序列主键
     * @return 结果
     */
    @Override
    public int deleteSampleCodeSeqBySeqId(Long seqId) {
        return sampleCodeSeqMapper.deleteSampleCodeSeqBySeqId(seqId);
    }

    /**
     * 获取下一个序列值
     * 
     * @param ruleId  规则ID
     * @param seqDate 序列日期
     * @return 序列值
     */
    @Override
    @org.springframework.transaction.annotation.Transactional
    public long getNextSequence(Long ruleId, String seqDate) {
        SampleCodeSeq seq = sampleCodeSeqMapper.selectSampleCodeSeqForUpdate(ruleId, seqDate);
        if (seq == null) {
            seq = new SampleCodeSeq();
            seq.setRuleId(ruleId);
            seq.setSeqDate(seqDate);
            seq.setSeqValue(1L);
            seq.setCreateTime(DateUtils.getNowDate());
            seq.setUpdateTime(DateUtils.getNowDate());
            sampleCodeSeqMapper.insertSampleCodeSeq(seq);
            return 1L;
        } else {
            seq.setSeqValue(seq.getSeqValue() + 1);
            seq.setUpdateTime(DateUtils.getNowDate());
            sampleCodeSeqMapper.updateSampleCodeSeq(seq);
            return seq.getSeqValue();
        }
    }
}
