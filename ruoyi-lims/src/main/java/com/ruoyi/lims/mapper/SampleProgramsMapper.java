package com.ruoyi.lims.mapper;

import java.util.List;
import com.ruoyi.lims.domain.SamplePrograms;

/**
 * 执行标准Mapper接口
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public interface SampleProgramsMapper 
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
     * 删除执行标准
     * 
     * @param sampleProgramsId 执行标准主键
     * @return 结果
     */
    public int deleteSampleProgramsBySampleProgramsId(Long sampleProgramsId);

    /**
     * 批量删除执行标准
     * 
     * @param sampleProgramsIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSampleProgramsBySampleProgramsIds(Long[] sampleProgramsIds);
}
