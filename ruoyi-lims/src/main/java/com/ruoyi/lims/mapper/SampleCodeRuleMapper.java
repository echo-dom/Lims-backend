package com.ruoyi.lims.mapper;

import java.util.List;
import com.ruoyi.lims.domain.SampleCodeRule;

/**
 * 样品编码规则Mapper接口
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public interface SampleCodeRuleMapper 
{
    /**
     * 查询样品编码规则
     * 
     * @param ruleId 样品编码规则主键
     * @return 样品编码规则
     */
    public SampleCodeRule selectSampleCodeRuleByRuleId(Long ruleId);

    /**
     * 查询样品编码规则列表
     * 
     * @param sampleCodeRule 样品编码规则
     * @return 样品编码规则集合
     */
    public List<SampleCodeRule> selectSampleCodeRuleList(SampleCodeRule sampleCodeRule);

    /**
     * 新增样品编码规则
     * 
     * @param sampleCodeRule 样品编码规则
     * @return 结果
     */
    public int insertSampleCodeRule(SampleCodeRule sampleCodeRule);

    /**
     * 修改样品编码规则
     * 
     * @param sampleCodeRule 样品编码规则
     * @return 结果
     */
    public int updateSampleCodeRule(SampleCodeRule sampleCodeRule);

    /**
     * 删除样品编码规则
     * 
     * @param ruleId 样品编码规则主键
     * @return 结果
     */
    public int deleteSampleCodeRuleByRuleId(Long ruleId);

    /**
     * 批量删除样品编码规则
     * 
     * @param ruleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSampleCodeRuleByRuleIds(Long[] ruleIds);
}
