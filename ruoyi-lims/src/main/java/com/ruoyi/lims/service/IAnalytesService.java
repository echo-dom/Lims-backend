package com.ruoyi.lims.service;

import java.util.List;
import com.ruoyi.lims.domain.Analytes;

/**
 * 分析项目定义Service接口
 * 
 * @author kongdejin
 * @date 2025-06-17
 */
public interface IAnalytesService 
{
    /**
     * 查询分析项目定义
     * 
     * @param analytesid 分析项目定义主键
     * @return 分析项目定义
     */
    public Analytes selectAnalytesByAnalytesid(String analytesid);

    /**
     * 查询分析项目定义列表
     * 
     * @param analytes 分析项目定义
     * @return 分析项目定义集合
     */
    public List<Analytes> selectAnalytesList(Analytes analytes);

    /**
     * 新增分析项目定义
     * 
     * @param analytes 分析项目定义
     * @return 结果
     */
    public int insertAnalytes(Analytes analytes);

    /**
     * 修改分析项目定义
     * 
     * @param analytes 分析项目定义
     * @return 结果
     */
    public int updateAnalytes(Analytes analytes);

    /**
     * 批量删除分析项目定义
     * 
     * @param analytesids 需要删除的分析项目定义主键集合
     * @return 结果
     */
    public int deleteAnalytesByAnalytesids(String[] analytesids);

    /**
     * 删除分析项目定义信息
     * 
     * @param analytesid 分析项目定义主键
     * @return 结果
     */
    public int deleteAnalytesByAnalytesid(String analytesid);
}
