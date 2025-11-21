package com.ruoyi.lims.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * LIMS样品对象 lims_sample
 * 
 * @author kongdejin
 * @date 2025-06-05
 */
public class Sample extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 样品ID */
    private Long sampleId;

    /** 样品编码 */
    @Excel(name = "样品编码")
    private String sampleCode;

    /** 样品名称 */
    @Excel(name = "样品名称")
    private String sampleName;

    /** 样品类型ID */
    @Excel(name = "样品类型ID")
    private Long sampleTypeId;

    /** 客户ID */
    @Excel(name = "客户ID")
    private Long customerId;

    /** 批次号 */
    @Excel(name = "批次号")
    private String batchNumber;

    /** 生产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date productionDate;

    /** 有效期至 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "有效期至", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expiryDate;

    /** 采样日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "采样日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date samplingDate;

    /** 采样地点 */
    @Excel(name = "采样地点")
    private String samplingLocation;

    /** 样品状态（received:已接收, testing:检测中, completed:已完成, cancelled:已取消） */
    @Excel(name = "样品状态", readConverterExp = "r=eceived:已接收,,t=esting:检测中,,c=ompleted:已完成,,c=ancelled:已取消")
    private String sampleStatus;

    /** 存储位置 */
    @Excel(name = "存储位置")
    private String storageLocation;

    public void setSampleId(Long sampleId) 
    {
        this.sampleId = sampleId;
    }

    public Long getSampleId() 
    {
        return sampleId;
    }

    public void setSampleCode(String sampleCode) 
    {
        this.sampleCode = sampleCode;
    }

    public String getSampleCode() 
    {
        return sampleCode;
    }

    public void setSampleName(String sampleName) 
    {
        this.sampleName = sampleName;
    }

    public String getSampleName() 
    {
        return sampleName;
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

    public void setBatchNumber(String batchNumber) 
    {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() 
    {
        return batchNumber;
    }

    public void setProductionDate(Date productionDate) 
    {
        this.productionDate = productionDate;
    }

    public Date getProductionDate() 
    {
        return productionDate;
    }

    public void setExpiryDate(Date expiryDate) 
    {
        this.expiryDate = expiryDate;
    }

    public Date getExpiryDate() 
    {
        return expiryDate;
    }

    public void setSamplingDate(Date samplingDate) 
    {
        this.samplingDate = samplingDate;
    }

    public Date getSamplingDate() 
    {
        return samplingDate;
    }

    public void setSamplingLocation(String samplingLocation) 
    {
        this.samplingLocation = samplingLocation;
    }

    public String getSamplingLocation() 
    {
        return samplingLocation;
    }

    public void setSampleStatus(String sampleStatus) 
    {
        this.sampleStatus = sampleStatus;
    }

    public String getSampleStatus() 
    {
        return sampleStatus;
    }

    public void setStorageLocation(String storageLocation) 
    {
        this.storageLocation = storageLocation;
    }

    public String getStorageLocation() 
    {
        return storageLocation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sampleId", getSampleId())
            .append("sampleCode", getSampleCode())
            .append("sampleName", getSampleName())
            .append("sampleTypeId", getSampleTypeId())
            .append("customerId", getCustomerId())
            .append("batchNumber", getBatchNumber())
            .append("productionDate", getProductionDate())
            .append("expiryDate", getExpiryDate())
            .append("samplingDate", getSamplingDate())
            .append("samplingLocation", getSamplingLocation())
            .append("sampleStatus", getSampleStatus())
            .append("storageLocation", getStorageLocation())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
