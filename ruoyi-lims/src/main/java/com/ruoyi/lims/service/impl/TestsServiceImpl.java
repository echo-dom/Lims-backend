package com.ruoyi.lims.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.TestsMapper;
import com.ruoyi.lims.domain.Tests;
import com.ruoyi.lims.service.ITestsService;

/**
 * 测试项目Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-11-24
 */
@Service
public class TestsServiceImpl implements ITestsService 
{
    @Autowired
    private TestsMapper testsMapper;

    /**
     * 查询测试项目
     * 
     * @param testId 测试项目主键
     * @return 测试项目
     */
    @Override
    public Tests selectTestsByTestId(Long testId)
    {
        return testsMapper.selectTestsByTestId(testId);
    }

    /**
     * 查询测试项目列表
     * 
     * @param tests 测试项目
     * @return 测试项目
     */
    @Override
    public List<Tests> selectTestsList(Tests tests)
    {
        return testsMapper.selectTestsList(tests);
    }

    /**
     * 新增测试项目
     * 
     * @param tests 测试项目
     * @return 结果
     */
    @Override
    public int insertTests(Tests tests)
    {
        tests.setCreateTime(DateUtils.getNowDate());
        return testsMapper.insertTests(tests);
    }

    /**
     * 修改测试项目
     * 
     * @param tests 测试项目
     * @return 结果
     */
    @Override
    public int updateTests(Tests tests)
    {
        tests.setUpdateTime(DateUtils.getNowDate());
        return testsMapper.updateTests(tests);
    }

    /**
     * 批量删除测试项目
     * 
     * @param testIds 需要删除的测试项目主键
     * @return 结果
     */
    @Override
    public int deleteTestsByTestIds(Long[] testIds)
    {
        return testsMapper.deleteTestsByTestIds(testIds);
    }

    /**
     * 删除测试项目信息
     * 
     * @param testId 测试项目主键
     * @return 结果
     */
    @Override
    public int deleteTestsByTestId(Long testId)
    {
        return testsMapper.deleteTestsByTestId(testId);
    }
}
