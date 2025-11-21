package com.ruoyi.lims.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 样品编码序列对象 lims_sample_code_seq
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public class SampleCodeSeq extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序列ID */
    private Long seqId;

    /** 规则ID */
    @Excel(name = "规则ID")
    private Long ruleId;

    /** 序列日期(yyyyMMdd/yyyyMM/yyyy) */
    @Excel(name = "序列日期(yyyyMMdd/yyyyMM/yyyy)")
    private String seqDate;

    /** 序列值 */
    @Excel(name = "序列值")
    private Long seqValue;

    public void setSeqId(Long seqId) 
    {
        this.seqId = seqId;
    }

    public Long getSeqId() 
    {
        return seqId;
    }

    public void setRuleId(Long ruleId) 
    {
        this.ruleId = ruleId;
    }

    public Long getRuleId() 
    {
        return ruleId;
    }

    public void setSeqDate(String seqDate) 
    {
        this.seqDate = seqDate;
    }

    public String getSeqDate() 
    {
        return seqDate;
    }

    public void setSeqValue(Long seqValue) 
    {
        this.seqValue = seqValue;
    }

    public Long getSeqValue() 
    {
        return seqValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("seqId", getSeqId())
            .append("ruleId", getRuleId())
            .append("seqDate", getSeqDate())
            .append("seqValue", getSeqValue())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
