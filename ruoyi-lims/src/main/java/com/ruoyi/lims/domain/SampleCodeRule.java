package com.ruoyi.lims.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 样品编码规则对象 lims_sample_code_rule
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public class SampleCodeRule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 规则ID */
    private Long ruleId;

    /** 规则名称 */
    @Excel(name = "规则名称")
    private String ruleName;

    /** 编码模板 */
    @Excel(name = "编码模板")
    private String pattern;

    /** 重置类型：day-日 month-月 year-年 manual-手动 */
    @Excel(name = "重置类型：day-日 month-月 year-年 manual-手动")
    private String resetType;

    /** 前缀 */
    @Excel(name = "前缀")
    private String prefix;

    /** 序列长度 */
    @Excel(name = "序列长度")
    private Long seqLength;

    /** 样品类型ID */
    @Excel(name = "样品类型ID")
    private Long sampleTypeId;

    /** 客户ID */
    @Excel(name = "客户ID")
    private Long customerId;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setRuleId(Long ruleId) 
    {
        this.ruleId = ruleId;
    }

    public Long getRuleId() 
    {
        return ruleId;
    }

    public void setRuleName(String ruleName) 
    {
        this.ruleName = ruleName;
    }

    public String getRuleName() 
    {
        return ruleName;
    }

    public void setPattern(String pattern) 
    {
        this.pattern = pattern;
    }

    public String getPattern() 
    {
        return pattern;
    }

    public void setResetType(String resetType) 
    {
        this.resetType = resetType;
    }

    public String getResetType() 
    {
        return resetType;
    }

    public void setPrefix(String prefix) 
    {
        this.prefix = prefix;
    }

    public String getPrefix() 
    {
        return prefix;
    }

    public void setSeqLength(Long seqLength) 
    {
        this.seqLength = seqLength;
    }

    public Long getSeqLength() 
    {
        return seqLength;
    }

    public void setSampleTypeId(Long sampleTypeId) 
    {
        this.sampleTypeId = sampleTypeId;
    }

    public Long getSampleTypeId() 
    {
        return sampleTypeId;
    }

    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ruleId", getRuleId())
            .append("ruleName", getRuleName())
            .append("pattern", getPattern())
            .append("resetType", getResetType())
            .append("prefix", getPrefix())
            .append("seqLength", getSeqLength())
            .append("sampleTypeId", getSampleTypeId())
            .append("customerId", getCustomerId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
