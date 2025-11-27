package com.ruoyi.lims.service;

import java.util.List;
import com.ruoyi.lims.domain.Tests;

/**
 * 测试项目Service接口
 * 
 * @author kongdejin
 * @date 2025-11-24
 */
public interface ITestsService 
{
    /**
     * 查询测试项目
     * 
     * @param testId 测试项目主键
     * @return 测试项目
     */
    public Tests selectTestsByTestId(Long testId);

    /**
     * 查询测试项目列表
     * 
     * @param tests 测试项目
     * @return 测试项目集合
     */
    public List<Tests> selectTestsList(Tests tests);

    /**
     * 新增测试项目
     * 
     * @param tests 测试项目
     * @return 结果
     */
    public int insertTests(Tests tests);

    /**
     * 修改测试项目
     * 
     * @param tests 测试项目
     * @return 结果
     */
    public int updateTests(Tests tests);

    /**
     * 批量删除测试项目
     * 
     * @param testIds 需要删除的测试项目主键集合
     * @return 结果
     */
    public int deleteTestsByTestIds(Long[] testIds);

    /**
     * 删除测试项目信息
     * 
     * @param testId 测试项目主键
     * @return 结果
     */
    public int deleteTestsByTestId(Long testId);
}
