package com.ruoyi.lims.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.TestMethodsMapper;
import com.ruoyi.lims.domain.TestMethods;
import com.ruoyi.lims.service.ITestMethodsService;

/**
 * 测试方法Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-11-19
 */
@Service
public class TestMethodsServiceImpl implements ITestMethodsService 
{
    @Autowired
    private TestMethodsMapper testMethodsMapper;

    /**
     * 查询测试方法
     * 
     * @param testMethodsId 测试方法主键
     * @return 测试方法
     */
    @Override
    public TestMethods selectTestMethodsByTestMethodsId(Long testMethodsId)
    {
        return testMethodsMapper.selectTestMethodsByTestMethodsId(testMethodsId);
    }

    /**
     * 查询测试方法列表
     * 
     * @param testMethods 测试方法
     * @return 测试方法
     */
    @Override
    public List<TestMethods> selectTestMethodsList(TestMethods testMethods)
    {
        return testMethodsMapper.selectTestMethodsList(testMethods);
    }

    /**
     * 新增测试方法
     * 
     * @param testMethods 测试方法
     * @return 结果
     */
    @Override
    public int insertTestMethods(TestMethods testMethods)
    {
        testMethods.setCreateTime(DateUtils.getNowDate());
        return testMethodsMapper.insertTestMethods(testMethods);
    }

    /**
     * 修改测试方法
     * 
     * @param testMethods 测试方法
     * @return 结果
     */
    @Override
    public int updateTestMethods(TestMethods testMethods)
    {
        testMethods.setUpdateTime(DateUtils.getNowDate());
        return testMethodsMapper.updateTestMethods(testMethods);
    }

    /**
     * 批量删除测试方法
     * 
     * @param testMethodsIds 需要删除的测试方法主键
     * @return 结果
     */
    @Override
    public int deleteTestMethodsByTestMethodsIds(Long[] testMethodsIds)
    {
        return testMethodsMapper.deleteTestMethodsByTestMethodsIds(testMethodsIds);
    }

    /**
     * 删除测试方法信息
     * 
     * @param testMethodsId 测试方法主键
     * @return 结果
     */
    @Override
    public int deleteTestMethodsByTestMethodsId(Long testMethodsId)
    {
        return testMethodsMapper.deleteTestMethodsByTestMethodsId(testMethodsId);
    }
}
