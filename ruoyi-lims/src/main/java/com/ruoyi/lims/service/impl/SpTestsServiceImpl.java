package com.ruoyi.lims.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.SpTestsMapper;
import com.ruoyi.lims.domain.SpTests;
import com.ruoyi.lims.service.ISpTestsService;

/**
 * 方案项目Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-11-24
 */
@Service
public class SpTestsServiceImpl implements ISpTestsService 
{
    @Autowired
    private SpTestsMapper spTestsMapper;

    /**
     * 查询方案项目
     * 
     * @param spTestsId 方案项目主键
     * @return 方案项目
     */
    @Override
    public SpTests selectSpTestsBySpTestsId(Long spTestsId)
    {
        return spTestsMapper.selectSpTestsBySpTestsId(spTestsId);
    }

    /**
     * 查询方案项目列表
     * 
     * @param spTests 方案项目
     * @return 方案项目
     */
    @Override
    public List<SpTests> selectSpTestsList(SpTests spTests)
    {
        return spTestsMapper.selectSpTestsList(spTests);
    }

    /**
     * 新增方案项目
     * 
     * @param spTests 方案项目
     * @return 结果
     */
    @Override
    public int insertSpTests(SpTests spTests)
    {
        spTests.setCreateTime(DateUtils.getNowDate());
        return spTestsMapper.insertSpTests(spTests);
    }

    /**
     * 修改方案项目
     * 
     * @param spTests 方案项目
     * @return 结果
     */
    @Override
    public int updateSpTests(SpTests spTests)
    {
        spTests.setUpdateTime(DateUtils.getNowDate());
        return spTestsMapper.updateSpTests(spTests);
    }

    /**
     * 批量删除方案项目
     * 
     * @param spTestsIds 需要删除的方案项目主键
     * @return 结果
     */
    @Override
    public int deleteSpTestsBySpTestsIds(Long[] spTestsIds)
    {
        return spTestsMapper.deleteSpTestsBySpTestsIds(spTestsIds);
    }

    /**
     * 删除方案项目信息
     * 
     * @param spTestsId 方案项目主键
     * @return 结果
     */
    @Override
    public int deleteSpTestsBySpTestsId(Long spTestsId)
    {
        return spTestsMapper.deleteSpTestsBySpTestsId(spTestsId);
    }
}
