package com.ruoyi.lims.service;

import java.util.List;
import com.ruoyi.lims.domain.SpTests;

/**
 * 方案项目Service接口
 * 
 * @author kongdejin
 * @date 2025-11-24
 */
public interface ISpTestsService 
{
    /**
     * 查询方案项目
     * 
     * @param spTestsId 方案项目主键
     * @return 方案项目
     */
    public SpTests selectSpTestsBySpTestsId(Long spTestsId);

    /**
     * 查询方案项目列表
     * 
     * @param spTests 方案项目
     * @return 方案项目集合
     */
    public List<SpTests> selectSpTestsList(SpTests spTests);

    /**
     * 新增方案项目
     * 
     * @param spTests 方案项目
     * @return 结果
     */
    public int insertSpTests(SpTests spTests);

    /**
     * 修改方案项目
     * 
     * @param spTests 方案项目
     * @return 结果
     */
    public int updateSpTests(SpTests spTests);

    /**
     * 批量删除方案项目
     * 
     * @param spTestsIds 需要删除的方案项目主键集合
     * @return 结果
     */
    public int deleteSpTestsBySpTestsIds(Long[] spTestsIds);

    /**
     * 删除方案项目信息
     * 
     * @param spTestsId 方案项目主键
     * @return 结果
     */
    public int deleteSpTestsBySpTestsId(Long spTestsId);
}
