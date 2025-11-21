package com.ruoyi.lims.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.SampleCodeRuleMapper;
import com.ruoyi.lims.domain.SampleCodeRule;
import com.ruoyi.lims.service.ISampleCodeRuleService;

/**
 * 样品编码规则Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
@Service
public class SampleCodeRuleServiceImpl implements ISampleCodeRuleService 
{
    @Autowired
    private SampleCodeRuleMapper sampleCodeRuleMapper;

    /**
     * 查询样品编码规则
     * 
     * @param ruleId 样品编码规则主键
     * @return 样品编码规则
     */
    @Override
    public SampleCodeRule selectSampleCodeRuleByRuleId(Long ruleId)
    {
        return sampleCodeRuleMapper.selectSampleCodeRuleByRuleId(ruleId);
    }

    /**
     * 查询样品编码规则列表
     * 
     * @param sampleCodeRule 样品编码规则
     * @return 样品编码规则
     */
    @Override
    public List<SampleCodeRule> selectSampleCodeRuleList(SampleCodeRule sampleCodeRule)
    {
        return sampleCodeRuleMapper.selectSampleCodeRuleList(sampleCodeRule);
    }

    /**
     * 新增样品编码规则
     * 
     * @param sampleCodeRule 样品编码规则
     * @return 结果
     */
    @Override
    public int insertSampleCodeRule(SampleCodeRule sampleCodeRule)
    {
        sampleCodeRule.setCreateTime(DateUtils.getNowDate());
        return sampleCodeRuleMapper.insertSampleCodeRule(sampleCodeRule);
    }

    /**
     * 修改样品编码规则
     * 
     * @param sampleCodeRule 样品编码规则
     * @return 结果
     */
    @Override
    public int updateSampleCodeRule(SampleCodeRule sampleCodeRule)
    {
        sampleCodeRule.setUpdateTime(DateUtils.getNowDate());
        return sampleCodeRuleMapper.updateSampleCodeRule(sampleCodeRule);
    }

    /**
     * 批量删除样品编码规则
     * 
     * @param ruleIds 需要删除的样品编码规则主键
     * @return 结果
     */
    @Override
    public int deleteSampleCodeRuleByRuleIds(Long[] ruleIds)
    {
        return sampleCodeRuleMapper.deleteSampleCodeRuleByRuleIds(ruleIds);
    }

    /**
     * 删除样品编码规则信息
     * 
     * @param ruleId 样品编码规则主键
     * @return 结果
     */
    @Override
    public int deleteSampleCodeRuleByRuleId(Long ruleId)
    {
        return sampleCodeRuleMapper.deleteSampleCodeRuleByRuleId(ruleId);
    }
}
