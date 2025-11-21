package com.ruoyi.lims.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 方案对象 lims_project
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public class Project extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long projectId;

    /** 原系统ID */
    @Excel(name = "原系统ID")
    private String originalId;

    /** 方案代码 */
    @Excel(name = "方案代码")
    private String programCode;

    /** 方案类型 */
    @Excel(name = "方案类型")
    private String profileType;

    /** 方案名称 */
    @Excel(name = "方案名称")
    private String profile;

    /** 主项目数 */
    @Excel(name = "主项目数")
    private String mainProNum;

    /** 启用日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "启用日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startUseDate;

    /** 到期日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "到期日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expirationDate;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 显示状态 */
    @Excel(name = "显示状态")
    private String dispStatus;

    /** 行审核状态 */
    @Excel(name = "行审核状态")
    private String rowAudit;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal mPrice;

    /** 方案说明 */
    @Excel(name = "方案说明")
    private String explainDesc;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setProjectId(Long projectId) 
    {
        this.projectId = projectId;
    }

    public Long getProjectId() 
    {
        return projectId;
    }

    public void setOriginalId(String originalId) 
    {
        this.originalId = originalId;
    }

    public String getOriginalId() 
    {
        return originalId;
    }

    public void setProgramCode(String programCode) 
    {
        this.programCode = programCode;
    }

    public String getProgramCode() 
    {
        return programCode;
    }

    public void setProfileType(String profileType) 
    {
        this.profileType = profileType;
    }

    public String getProfileType() 
    {
        return profileType;
    }

    public void setProfile(String profile) 
    {
        this.profile = profile;
    }

    public String getProfile() 
    {
        return profile;
    }

    public void setMainProNum(String mainProNum) 
    {
        this.mainProNum = mainProNum;
    }

    public String getMainProNum() 
    {
        return mainProNum;
    }

    public void setStartUseDate(Date startUseDate) 
    {
        this.startUseDate = startUseDate;
    }

    public Date getStartUseDate() 
    {
        return startUseDate;
    }

    public void setExpirationDate(Date expirationDate) 
    {
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() 
    {
        return expirationDate;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setDispStatus(String dispStatus) 
    {
        this.dispStatus = dispStatus;
    }

    public String getDispStatus() 
    {
        return dispStatus;
    }

    public void setRowAudit(String rowAudit) 
    {
        this.rowAudit = rowAudit;
    }

    public String getRowAudit() 
    {
        return rowAudit;
    }

    public void setmPrice(BigDecimal mPrice) 
    {
        this.mPrice = mPrice;
    }

    public BigDecimal getmPrice() 
    {
        return mPrice;
    }

    public void setExplainDesc(String explainDesc) 
    {
        this.explainDesc = explainDesc;
    }

    public String getExplainDesc() 
    {
        return explainDesc;
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
            .append("projectId", getProjectId())
            .append("originalId", getOriginalId())
            .append("programCode", getProgramCode())
            .append("profileType", getProfileType())
            .append("profile", getProfile())
            .append("mainProNum", getMainProNum())
            .append("startUseDate", getStartUseDate())
            .append("expirationDate", getExpirationDate())
            .append("status", getStatus())
            .append("dispStatus", getDispStatus())
            .append("rowAudit", getRowAudit())
            .append("mPrice", getmPrice())
            .append("explainDesc", getExplainDesc())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
