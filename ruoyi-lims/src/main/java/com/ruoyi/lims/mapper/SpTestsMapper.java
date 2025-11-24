package com.ruoyi.lims.mapper;

import java.util.List;
import com.ruoyi.lims.domain.SpTests;

/**
 * 方案项目Mapper接口
 * 
 * @author kongdejin
 * @date 2025-11-24
 */
public interface SpTestsMapper 
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
     * 删除方案项目
     * 
     * @param spTestsId 方案项目主键
     * @return 结果
     */
    public int deleteSpTestsBySpTestsId(Long spTestsId);

    /**
     * 批量删除方案项目
     * 
     * @param spTestsIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSpTestsBySpTestsIds(Long[] spTestsIds);
}
