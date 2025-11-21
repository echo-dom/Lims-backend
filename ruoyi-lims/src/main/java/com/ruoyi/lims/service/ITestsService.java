package com.ruoyi.lims.service;

import java.util.List;
import com.ruoyi.lims.domain.Tests;

/**
 * 检验项目（LIMS_TESTS）Service接口
 * 
 * @author kongdejin
 * @date 2025-06-17
 */
public interface ITestsService 
{
    /**
     * 查询检验项目（LIMS_TESTS）
     * 
     * @param TESTSID 检验项目（LIMS_TESTS）主键
     * @return 检验项目（LIMS_TESTS）
     */
    public Tests selectTestsByTESTSID(String TESTSID);

    /**
     * 查询检验项目（LIMS_TESTS）列表
     * 
     * @param tests 检验项目（LIMS_TESTS）
     * @return 检验项目（LIMS_TESTS）集合
     */
    public List<Tests> selectTestsList(Tests tests);

    /**
     * 新增检验项目（LIMS_TESTS）
     * 
     * @param tests 检验项目（LIMS_TESTS）
     * @return 结果
     */
    public int insertTests(Tests tests);

    /**
     * 修改检验项目（LIMS_TESTS）
     * 
     * @param tests 检验项目（LIMS_TESTS）
     * @return 结果
     */
    public int updateTests(Tests tests);

    /**
     * 批量删除检验项目（LIMS_TESTS）
     * 
     * @param TESTSIDs 需要删除的检验项目（LIMS_TESTS）主键集合
     * @return 结果
     */
    public int deleteTestsByTESTSIDs(String[] TESTSIDs);

    /**
     * 删除检验项目（LIMS_TESTS）信息
     * 
     * @param TESTSID 检验项目（LIMS_TESTS）主键
     * @return 结果
     */
    public int deleteTestsByTESTSID(String TESTSID);
}
