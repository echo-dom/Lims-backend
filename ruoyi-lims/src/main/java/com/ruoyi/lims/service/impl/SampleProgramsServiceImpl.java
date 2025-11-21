package com.ruoyi.lims.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.SampleProgramsMapper;
import com.ruoyi.lims.domain.SamplePrograms;
import com.ruoyi.lims.service.ISampleProgramsService;

/**
 * 执行标准Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
@Service
public class SampleProgramsServiceImpl implements ISampleProgramsService 
{
    @Autowired
    private SampleProgramsMapper sampleProgramsMapper;

    /**
     * 查询执行标准
     * 
     * @param sampleProgramsId 执行标准主键
     * @return 执行标准
     */
    @Override
    public SamplePrograms selectSampleProgramsBySampleProgramsId(Long sampleProgramsId)
    {
        return sampleProgramsMapper.selectSampleProgramsBySampleProgramsId(sampleProgramsId);
    }

    /**
     * 查询执行标准列表
     * 
     * @param samplePrograms 执行标准
     * @return 执行标准
     */
    @Override
    public List<SamplePrograms> selectSampleProgramsList(SamplePrograms samplePrograms)
    {
        return sampleProgramsMapper.selectSampleProgramsList(samplePrograms);
    }

    /**
     * 新增执行标准
     * 
     * @param samplePrograms 执行标准
     * @return 结果
     */
    @Override
    public int insertSamplePrograms(SamplePrograms samplePrograms)
    {
        samplePrograms.setCreateTime(DateUtils.getNowDate());
        return sampleProgramsMapper.insertSamplePrograms(samplePrograms);
    }

    /**
     * 修改执行标准
     * 
     * @param samplePrograms 执行标准
     * @return 结果
     */
    @Override
    public int updateSamplePrograms(SamplePrograms samplePrograms)
    {
        samplePrograms.setUpdateTime(DateUtils.getNowDate());
        return sampleProgramsMapper.updateSamplePrograms(samplePrograms);
    }

    /**
     * 批量删除执行标准
     * 
     * @param sampleProgramsIds 需要删除的执行标准主键
     * @return 结果
     */
    @Override
    public int deleteSampleProgramsBySampleProgramsIds(Long[] sampleProgramsIds)
    {
        return sampleProgramsMapper.deleteSampleProgramsBySampleProgramsIds(sampleProgramsIds);
    }

    /**
     * 删除执行标准信息
     * 
     * @param sampleProgramsId 执行标准主键
     * @return 结果
     */
    @Override
    public int deleteSampleProgramsBySampleProgramsId(Long sampleProgramsId)
    {
        return sampleProgramsMapper.deleteSampleProgramsBySampleProgramsId(sampleProgramsId);
    }
}
