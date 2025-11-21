package com.ruoyi.lims.mapper;

import java.util.List;
import com.ruoyi.lims.domain.TestMethods;

/**
 * 测试方法Mapper接口
 * 
 * @author kongdejin
 * @date 2025-11-19
 */
public interface TestMethodsMapper 
{
    /**
     * 查询测试方法
     * 
     * @param testMethodsId 测试方法主键
     * @return 测试方法
     */
    public TestMethods selectTestMethodsByTestMethodsId(Long testMethodsId);

    /**
     * 查询测试方法列表
     * 
     * @param testMethods 测试方法
     * @return 测试方法集合
     */
    public List<TestMethods> selectTestMethodsList(TestMethods testMethods);

    /**
     * 新增测试方法
     * 
     * @param testMethods 测试方法
     * @return 结果
     */
    public int insertTestMethods(TestMethods testMethods);

    /**
     * 修改测试方法
     * 
     * @param testMethods 测试方法
     * @return 结果
     */
    public int updateTestMethods(TestMethods testMethods);

    /**
     * 删除测试方法
     * 
     * @param testMethodsId 测试方法主键
     * @return 结果
     */
    public int deleteTestMethodsByTestMethodsId(Long testMethodsId);

    /**
     * 批量删除测试方法
     * 
     * @param testMethodsIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTestMethodsByTestMethodsIds(Long[] testMethodsIds);
}
