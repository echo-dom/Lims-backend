package com.ruoyi.lims.mapper;

import java.util.List;
import com.ruoyi.lims.domain.SampleCodeSeq;

/**
 * 样品编码序列Mapper接口
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public interface SampleCodeSeqMapper {
    /**
     * 查询样品编码序列
     * 
     * @param seqId 样品编码序列主键
     * @return 样品编码序列
     */
    public SampleCodeSeq selectSampleCodeSeqBySeqId(Long seqId);

    /**
     * 查询样品编码序列列表
     * 
     * @param sampleCodeSeq 样品编码序列
     * @return 样品编码序列集合
     */
    public List<SampleCodeSeq> selectSampleCodeSeqList(SampleCodeSeq sampleCodeSeq);

    /**
     * 新增样品编码序列
     * 
     * @param sampleCodeSeq 样品编码序列
     * @return 结果
     */
    public int insertSampleCodeSeq(SampleCodeSeq sampleCodeSeq);

    /**
     * 修改样品编码序列
     * 
     * @param sampleCodeSeq 样品编码序列
     * @return 结果
     */
    public int updateSampleCodeSeq(SampleCodeSeq sampleCodeSeq);

    /**
     * 删除样品编码序列
     * 
     * @param seqId 样品编码序列主键
     * @return 结果
     */
    public int deleteSampleCodeSeqBySeqId(Long seqId);

    /**
     * 批量删除样品编码序列
     * 
     * @param seqIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSampleCodeSeqBySeqIds(Long[] seqIds);

    /**
     * 查询并锁定序列
     */
    public SampleCodeSeq selectSampleCodeSeqForUpdate(@org.apache.ibatis.annotations.Param("ruleId") Long ruleId,
            @org.apache.ibatis.annotations.Param("seqDate") String seqDate);
}
