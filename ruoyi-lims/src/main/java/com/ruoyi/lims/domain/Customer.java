package com.ruoyi.lims.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * LIMS客户对象 lims_customer
 * 
 * @author kongdejin
 * @date 2025-06-24
 */
public class Customer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户ID */
    private Long customerId;

    /** 单位名称 */
    @Excel(name = "单位名称")
    private String compname;

    /** 记录人代码 */
    @Excel(name = "记录人代码")
    private String recordercode;

    /** 记录人描述 */
    @Excel(name = "记录人描述")
    private String recorderdesc;

    /** 记录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recordtime;

    /** 单位代码 */
    @Excel(name = "单位代码")
    private String compcode;

    /** 单位简称 */
    @Excel(name = "单位简称")
    private String ccode;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }

    public void setCompname(String compname) 
    {
        this.compname = compname;
    }

    public String getCompname() 
    {
        return compname;
    }

    public void setRecordercode(String recordercode) 
    {
        this.recordercode = recordercode;
    }

    public String getRecordercode() 
    {
        return recordercode;
    }

    public void setRecorderdesc(String recorderdesc) 
    {
        this.recorderdesc = recorderdesc;
    }

    public String getRecorderdesc() 
    {
        return recorderdesc;
    }

    public void setRecordtime(Date recordtime) 
    {
        this.recordtime = recordtime;
    }

    public Date getRecordtime() 
    {
        return recordtime;
    }

    public void setCompcode(String compcode) 
    {
        this.compcode = compcode;
    }

    public String getCompcode() 
    {
        return compcode;
    }

    public void setCcode(String ccode) 
    {
        this.ccode = ccode;
    }

    public String getCcode() 
    {
        return ccode;
    }

    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("customerId", getCustomerId())
            .append("compname", getCompname())
            .append("recordercode", getRecordercode())
            .append("recorderdesc", getRecorderdesc())
            .append("recordtime", getRecordtime())
            .append("compcode", getCompcode())
            .append("ccode", getCcode())
            .append("remarks", getRemarks())
            .toString();
    }
}
