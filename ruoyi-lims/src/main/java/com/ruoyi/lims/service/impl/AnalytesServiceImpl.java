package com.ruoyi.lims.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.AnalytesMapper;
import com.ruoyi.lims.domain.Analytes;
import com.ruoyi.lims.service.IAnalytesService;

/**
 * 分析项目定义Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-06-17
 */
@Service
public class AnalytesServiceImpl implements IAnalytesService 
{
    @Autowired
    private AnalytesMapper analytesMapper;

    /**
     * 查询分析项目定义
     * 
     * @param analytesid 分析项目定义主键
     * @return 分析项目定义
     */
    @Override
    public Analytes selectAnalytesByAnalytesid(String analytesid)
    {
        return analytesMapper.selectAnalytesByAnalytesid(analytesid);
    }

    /**
     * 查询分析项目定义列表
     * 
     * @param analytes 分析项目定义
     * @return 分析项目定义
     */
    @Override
    public List<Analytes> selectAnalytesList(Analytes analytes)
    {
        return analytesMapper.selectAnalytesList(analytes);
    }

    /**
     * 新增分析项目定义
     * 
     * @param analytes 分析项目定义
     * @return 结果
     */
    @Override
    public int insertAnalytes(Analytes analytes)
    {
        return analytesMapper.insertAnalytes(analytes);
    }

    /**
     * 修改分析项目定义
     * 
     * @param analytes 分析项目定义
     * @return 结果
     */
    @Override
    public int updateAnalytes(Analytes analytes)
    {
        return analytesMapper.updateAnalytes(analytes);
    }

    /**
     * 批量删除分析项目定义
     * 
     * @param analytesids 需要删除的分析项目定义主键
     * @return 结果
     */
    @Override
    public int deleteAnalytesByAnalytesids(String[] analytesids)
    {
        return analytesMapper.deleteAnalytesByAnalytesids(analytesids);
    }

    /**
     * 删除分析项目定义信息
     * 
     * @param analytesid 分析项目定义主键
     * @return 结果
     */
    @Override
    public int deleteAnalytesByAnalytesid(String analytesid)
    {
        return analytesMapper.deleteAnalytesByAnalytesid(analytesid);
    }
}
