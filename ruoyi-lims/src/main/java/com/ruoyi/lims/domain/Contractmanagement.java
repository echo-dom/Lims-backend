package com.ruoyi.lims.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合同管理对象 lims_contractmanagement
 * 
 * @author kongdejin
 * @date 2025-06-27
 */
public class Contractmanagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 合同ID */
    private String contractid;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractcode;

    /** 客户编号 */
    @Excel(name = "客户编号")
    private String customercode;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customername;

    /** 创建人名称 */
    @Excel(name = "创建人名称")
    private String createrdesc;

    /** 创建人工号 */
    @Excel(name = "创建人工号")
    private String creatercode;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createrdate;

    /** 合同名称 */
    @Excel(name = "合同名称")
    private String contractname;

    public void setContractid(String contractid) 
    {
        this.contractid = contractid;
    }

    public String getContractid() 
    {
        return contractid;
    }

    public void setContractcode(String contractcode) 
    {
        this.contractcode = contractcode;
    }

    public String getContractcode() 
    {
        return contractcode;
    }

    public void setCustomercode(String customercode) 
    {
        this.customercode = customercode;
    }

    public String getCustomercode() 
    {
        return customercode;
    }

    public void setCustomername(String customername) 
    {
        this.customername = customername;
    }

    public String getCustomername() 
    {
        return customername;
    }

    public void setCreaterdesc(String createrdesc) 
    {
        this.createrdesc = createrdesc;
    }

    public String getCreaterdesc() 
    {
        return createrdesc;
    }

    public void setCreatercode(String creatercode) 
    {
        this.creatercode = creatercode;
    }

    public String getCreatercode() 
    {
        return creatercode;
    }

    public void setCreaterdate(Date createrdate) 
    {
        this.createrdate = createrdate;
    }

    public Date getCreaterdate() 
    {
        return createrdate;
    }

    public void setContractname(String contractname) 
    {
        this.contractname = contractname;
    }

    public String getContractname() 
    {
        return contractname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("contractid", getContractid())
            .append("contractcode", getContractcode())
            .append("customercode", getCustomercode())
            .append("customername", getCustomername())
            .append("createrdesc", getCreaterdesc())
            .append("creatercode", getCreatercode())
            .append("createrdate", getCreaterdate())
            .append("contractname", getContractname())
            .toString();
    }
}
