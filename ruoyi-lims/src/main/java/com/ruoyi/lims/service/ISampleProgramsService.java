package com.ruoyi.lims.service;

import java.util.List;
import com.ruoyi.lims.domain.SamplePrograms;

/**
 * 执行标准Service接口
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public interface ISampleProgramsService 
{
    /**
     * 查询执行标准
     * 
     * @param sampleProgramsId 执行标准主键
     * @return 执行标准
     */
    public SamplePrograms selectSampleProgramsBySampleProgramsId(Long sampleProgramsId);

    /**
     * 查询执行标准列表
     * 
     * @param samplePrograms 执行标准
     * @return 执行标准集合
     */
    public List<SamplePrograms> selectSampleProgramsList(SamplePrograms samplePrograms);

    /**
     * 新增执行标准
     * 
     * @param samplePrograms 执行标准
     * @return 结果
     */
    public int insertSamplePrograms(SamplePrograms samplePrograms);

    /**
     * 修改执行标准
     * 
     * @param samplePrograms 执行标准
     * @return 结果
     */
    public int updateSamplePrograms(SamplePrograms samplePrograms);

    /**
     * 批量删除执行标准
     * 
     * @param sampleProgramsIds 需要删除的执行标准主键集合
     * @return 结果
     */
    public int deleteSampleProgramsBySampleProgramsIds(Long[] sampleProgramsIds);

    /**
     * 删除执行标准信息
     * 
     * @param sampleProgramsId 执行标准主键
     * @return 结果
     */
    public int deleteSampleProgramsBySampleProgramsId(Long sampleProgramsId);
}
