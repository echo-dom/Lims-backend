package com.ruoyi.lims.mapper;

import java.util.List;
import com.ruoyi.lims.domain.Sample;

/**
 * LIMS样品Mapper接口
 * 
 * @author kongdejin
 * @date 2025-06-05
 */
public interface SampleMapper 
{
    /**
     * 查询LIMS样品
     * 
     * @param sampleId LIMS样品主键
     * @return LIMS样品
     */
    public Sample selectSampleBySampleId(Long sampleId);

    /**
     * 查询LIMS样品列表
     * 
     * @param sample LIMS样品
     * @return LIMS样品集合
     */
    public List<Sample> selectSampleList(Sample sample);

    /**
     * 新增LIMS样品
     * 
     * @param sample LIMS样品
     * @return 结果
     */
    public int insertSample(Sample sample);

    /**
     * 修改LIMS样品
     * 
     * @param sample LIMS样品
     * @return 结果
     */
    public int updateSample(Sample sample);

    /**
     * 删除LIMS样品
     * 
     * @param sampleId LIMS样品主键
     * @return 结果
     */
    public int deleteSampleBySampleId(Long sampleId);

    /**
     * 批量删除LIMS样品
     * 
     * @param sampleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSampleBySampleIds(Long[] sampleIds);
}
