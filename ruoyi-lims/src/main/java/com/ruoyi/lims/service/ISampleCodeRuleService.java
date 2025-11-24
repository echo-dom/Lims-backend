package com.ruoyi.lims.service;

import java.util.List;
import com.ruoyi.lims.domain.SampleCodeRule;

/**
 * 样品编码规则Service接口
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public interface ISampleCodeRuleService {
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
     * 批量删除样品编码规则
     * 
     * @param ruleIds 需要删除的样品编码规则主键集合
     * @return 结果
     */
    public int deleteSampleCodeRuleByRuleIds(Long[] ruleIds);

    /**
     * 删除样品编码规则信息
     * 
     * @param ruleId 样品编码规则主键
     * @return 结果
     */
    public int deleteSampleCodeRuleByRuleId(Long ruleId);

    /**
     * 匹配最佳样品编码规则
     * 
     * @param sampleTypeId 样品类型ID
     * @param customerId   客户ID
     * @return 规则对象
     */
    public SampleCodeRule selectMatchRule(Long sampleTypeId, Long customerId);
}
