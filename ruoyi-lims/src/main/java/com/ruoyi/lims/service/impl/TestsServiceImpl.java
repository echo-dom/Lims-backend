package com.ruoyi.lims.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.TestsMapper;
import com.ruoyi.lims.domain.Tests;
import com.ruoyi.lims.service.ITestsService;

/**
 * 检验项目（LIMS_TESTS）Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-06-17
 */
@Service
public class TestsServiceImpl implements ITestsService 
{
    @Autowired
    private TestsMapper testsMapper;

    /**
     * 查询检验项目（LIMS_TESTS）
     * 
     * @param TESTSID 检验项目（LIMS_TESTS）主键
     * @return 检验项目（LIMS_TESTS）
     */
    @Override
    public Tests selectTestsByTESTSID(String TESTSID)
    {
        return testsMapper.selectTestsByTESTSID(TESTSID);
    }

    /**
     * 查询检验项目（LIMS_TESTS）列表
     * 
     * @param tests 检验项目（LIMS_TESTS）
     * @return 检验项目（LIMS_TESTS）
     */
    @Override
    public List<Tests> selectTestsList(Tests tests)
    {
        return testsMapper.selectTestsList(tests);
    }

    /**
     * 新增检验项目（LIMS_TESTS）
     * 
     * @param tests 检验项目（LIMS_TESTS）
     * @return 结果
     */
    @Override
    public int insertTests(Tests tests)
    {
        tests.setCreateTime(DateUtils.getNowDate());
        return testsMapper.insertTests(tests);
    }

    /**
     * 修改检验项目（LIMS_TESTS）
     * 
     * @param tests 检验项目（LIMS_TESTS）
     * @return 结果
     */
    @Override
    public int updateTests(Tests tests)
    {
        tests.setUpdateTime(DateUtils.getNowDate());
        return testsMapper.updateTests(tests);
    }

    /**
     * 批量删除检验项目（LIMS_TESTS）
     * 
     * @param TESTSIDs 需要删除的检验项目（LIMS_TESTS）主键
     * @return 结果
     */
    @Override
    public int deleteTestsByTESTSIDs(String[] TESTSIDs)
    {
        return testsMapper.deleteTestsByTESTSIDs(TESTSIDs);
    }

    /**
     * 删除检验项目（LIMS_TESTS）信息
     * 
     * @param TESTSID 检验项目（LIMS_TESTS）主键
     * @return 结果
     */
    @Override
    public int deleteTestsByTESTSID(String TESTSID)
    {
        return testsMapper.deleteTestsByTESTSID(TESTSID);
    }
}
