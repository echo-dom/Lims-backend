package com.ruoyi.lims.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 执行标准对象 lims_sample_programs
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public class SamplePrograms extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long sampleProgramsId;

    /** 原系统ID */
    @Excel(name = "原系统ID")
    private String originalId;

    /** 执行标准编号 */
    @Excel(name = "执行标准编号")
    private String spCode;

    /** 备用标准编号 */
    @Excel(name = "备用标准编号")
    private String spCodeAlt;

    /** 测试规则 */
    @Excel(name = "测试规则")
    private String testRules;

    /** 标准ID */
    @Excel(name = "标准ID")
    private String criterionId;

    /** 版本号 */
    @Excel(name = "版本号")
    private String version;

    /** 领域ID */
    @Excel(name = "领域ID")
    private String domainId;

    /** 领域名称 */
    @Excel(name = "领域名称")
    private String domainName;

    /** 样品类型 */
    @Excel(name = "样品类型")
    private String sampleType;

    /** 完整类型 */
    @Excel(name = "完整类型")
    private String fullType;

    /** 详细名称 */
    @Excel(name = "详细名称")
    private String detailName;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 冻结标志（0未冻结 1已冻结） */
    @Excel(name = "冻结标志", readConverterExp = "0=未冻结,1=已冻结")
    private String freezeFlag;

    /** 是否校准（0否 1是） */
    @Excel(name = "是否校准", readConverterExp = "0=否,1=是")
    private String isCal;

    /** 显示状态 */
    @Excel(name = "显示状态")
    private String dispStatus;

    /** 冻结者 */
    @Excel(name = "冻结者")
    private String freezeBy;

    /** 冻结描述 */
    @Excel(name = "冻结描述")
    private String freezerDesc;

    /** 冻结时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "冻结时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date freezeTime;

    /** 记录者描述 */
    @Excel(name = "记录者描述")
    private String recorderDesc;

    /** 创建者描述 */
    @Excel(name = "创建者描述")
    private String createrDesc;

    /** 创建者代码 */
    @Excel(name = "创建者代码")
    private String createrCode;

    /** 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createrDate;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 排序 */
    @Excel(name = "排序")
    private Long sorter;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setSampleProgramsId(Long sampleProgramsId) 
    {
        this.sampleProgramsId = sampleProgramsId;
    }

    public Long getSampleProgramsId() 
    {
        return sampleProgramsId;
    }

    public void setOriginalId(String originalId) 
    {
        this.originalId = originalId;
    }

    public String getOriginalId() 
    {
        return originalId;
    }

    public void setSpCode(String spCode) 
    {
        this.spCode = spCode;
    }

    public String getSpCode() 
    {
        return spCode;
    }

    public void setSpCodeAlt(String spCodeAlt) 
    {
        this.spCodeAlt = spCodeAlt;
    }

    public String getSpCodeAlt() 
    {
        return spCodeAlt;
    }

    public void setTestRules(String testRules) 
    {
        this.testRules = testRules;
    }

    public String getTestRules() 
    {
        return testRules;
    }

    public void setCriterionId(String criterionId) 
    {
        this.criterionId = criterionId;
    }

    public String getCriterionId() 
    {
        return criterionId;
    }

    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }

    public void setDomainId(String domainId) 
    {
        this.domainId = domainId;
    }

    public String getDomainId() 
    {
        return domainId;
    }

    public void setDomainName(String domainName) 
    {
        this.domainName = domainName;
    }

    public String getDomainName() 
    {
        return domainName;
    }

    public void setSampleType(String sampleType) 
    {
        this.sampleType = sampleType;
    }

    public String getSampleType() 
    {
        return sampleType;
    }

    public void setFullType(String fullType) 
    {
        this.fullType = fullType;
    }

    public String getFullType() 
    {
        return fullType;
    }

    public void setDetailName(String detailName) 
    {
        this.detailName = detailName;
    }

    public String getDetailName() 
    {
        return detailName;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setFreezeFlag(String freezeFlag) 
    {
        this.freezeFlag = freezeFlag;
    }

    public String getFreezeFlag() 
    {
        return freezeFlag;
    }

    public void setIsCal(String isCal) 
    {
        this.isCal = isCal;
    }

    public String getIsCal() 
    {
        return isCal;
    }

    public void setDispStatus(String dispStatus) 
    {
        this.dispStatus = dispStatus;
    }

    public String getDispStatus() 
    {
        return dispStatus;
    }

    public void setFreezeBy(String freezeBy) 
    {
        this.freezeBy = freezeBy;
    }

    public String getFreezeBy() 
    {
        return freezeBy;
    }

    public void setFreezerDesc(String freezerDesc) 
    {
        this.freezerDesc = freezerDesc;
    }

    public String getFreezerDesc() 
    {
        return freezerDesc;
    }

    public void setFreezeTime(Date freezeTime) 
    {
        this.freezeTime = freezeTime;
    }

    public Date getFreezeTime() 
    {
        return freezeTime;
    }

    public void setRecorderDesc(String recorderDesc) 
    {
        this.recorderDesc = recorderDesc;
    }

    public String getRecorderDesc() 
    {
        return recorderDesc;
    }

    public void setCreaterDesc(String createrDesc) 
    {
        this.createrDesc = createrDesc;
    }

    public String getCreaterDesc() 
    {
        return createrDesc;
    }

    public void setCreaterCode(String createrCode) 
    {
        this.createrCode = createrCode;
    }

    public String getCreaterCode() 
    {
        return createrCode;
    }

    public void setCreaterDate(Date createrDate) 
    {
        this.createrDate = createrDate;
    }

    public Date getCreaterDate() 
    {
        return createrDate;
    }

    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }

    public void setSorter(Long sorter) 
    {
        this.sorter = sorter;
    }

    public Long getSorter() 
    {
        return sorter;
    }

    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sampleProgramsId", getSampleProgramsId())
            .append("originalId", getOriginalId())
            .append("spCode", getSpCode())
            .append("spCodeAlt", getSpCodeAlt())
            .append("testRules", getTestRules())
            .append("criterionId", getCriterionId())
            .append("version", getVersion())
            .append("domainId", getDomainId())
            .append("domainName", getDomainName())
            .append("sampleType", getSampleType())
            .append("fullType", getFullType())
            .append("detailName", getDetailName())
            .append("status", getStatus())
            .append("freezeFlag", getFreezeFlag())
            .append("isCal", getIsCal())
            .append("dispStatus", getDispStatus())
            .append("freezeBy", getFreezeBy())
            .append("freezerDesc", getFreezerDesc())
            .append("freezeTime", getFreezeTime())
            .append("recorderDesc", getRecorderDesc())
            .append("createrDesc", getCreaterDesc())
            .append("createrCode", getCreaterCode())
            .append("createrDate", getCreaterDate())
            .append("startTime", getStartTime())
            .append("sorter", getSorter())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
