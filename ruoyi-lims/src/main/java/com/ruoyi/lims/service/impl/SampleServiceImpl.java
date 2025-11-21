package com.ruoyi.lims.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.SampleMapper;
import com.ruoyi.lims.domain.Sample;
import com.ruoyi.lims.service.ISampleService;

/**
 * LIMS样品Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-06-05
 */
@Service
public class SampleServiceImpl implements ISampleService 
{
    @Autowired
    private SampleMapper sampleMapper;

    /**
     * 查询LIMS样品
     * 
     * @param sampleId LIMS样品主键
     * @return LIMS样品
     */
    @Override
    public Sample selectSampleBySampleId(Long sampleId)
    {
        return sampleMapper.selectSampleBySampleId(sampleId);
    }

    /**
     * 查询LIMS样品列表
     * 
     * @param sample LIMS样品
     * @return LIMS样品
     */
    @Override
    public List<Sample> selectSampleList(Sample sample)
    {
        return sampleMapper.selectSampleList(sample);
    }

    /**
     * 新增LIMS样品
     * 
     * @param sample LIMS样品
     * @return 结果
     */
    @Override
    public int insertSample(Sample sample)
    {
        sample.setCreateTime(DateUtils.getNowDate());
        return sampleMapper.insertSample(sample);
    }

    /**
     * 修改LIMS样品
     * 
     * @param sample LIMS样品
     * @return 结果
     */
    @Override
    public int updateSample(Sample sample)
    {
        sample.setUpdateTime(DateUtils.getNowDate());
        return sampleMapper.updateSample(sample);
    }

    /**
     * 批量删除LIMS样品
     * 
     * @param sampleIds 需要删除的LIMS样品主键
     * @return 结果
     */
    @Override
    public int deleteSampleBySampleIds(Long[] sampleIds)
    {
        return sampleMapper.deleteSampleBySampleIds(sampleIds);
    }

    /**
     * 删除LIMS样品信息
     * 
     * @param sampleId LIMS样品主键
     * @return 结果
     */
    @Override
    public int deleteSampleBySampleId(Long sampleId)
    {
        return sampleMapper.deleteSampleBySampleId(sampleId);
    }
}
