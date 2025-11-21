package com.ruoyi.lims.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试方法对象 lims_test_methods
 * 
 * @author kongdejin
 * @date 2025-11-19
 */
public class TestMethods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private String testMethodsId;

    /** 方法编号 */
    @Excel(name = "方法编号")
    private String methodCode;

    /** 方法号 */
    @Excel(name = "方法号")
    private String methodNo;

    /** 方法名称 */
    @Excel(name = "方法名称")
    private String methodName;

    /** 方法简称 */
    @Excel(name = "方法简称")
    private String methodNameEng;

    /** 方法类型 */
    @Excel(name = "方法类型")
    private String methodType;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 条款号 */
    @Excel(name = "条款号")
    private String clause;

    /** 条款名称 */
    @Excel(name = "条款名称")
    private String clauseName;

    /** 条款名称英文 */
    @Excel(name = "条款名称英文")
    private String clauseNameEng;

    /** 是否接单 */
    @Excel(name = "是否接单")
    private String isOrders;

    /** 方法状态 */
    @Excel(name = "方法状态")
    private String methodStatus;

    /** 方法状态值 */
    @Excel(name = "方法状态值")
    private String methodStatusValue;

    /** 方法描述 */
    @Excel(name = "方法描述")
    private String methodDesc;

    /** 版本号 */
    @Excel(name = "版本号")
    private String version;

    /** 检测仪器及条件 */
    @Excel(name = "检测仪器及条件")
    private String detectorAndCondition;

    /** 仪器备注及方法 */
    @Excel(name = "仪器备注及方法")
    private String eqRemarkAndMethod;

    /** 样品处理及方法概述 */
    @Excel(name = "样品处理及方法概述")
    private String methodOverview;

    /** 检验项目说明 */
    @Excel(name = "检验项目说明")
    private String testExplain;

    /** 方法说明 */
    @Excel(name = "方法说明")
    private String methodExplain;

    /** 耗材 */
    @Excel(name = "耗材")
    private String consumable;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setTestMethodsId(String testMethodsId)
    {
        this.testMethodsId = testMethodsId;
    }

    public String getTestMethodsId()
    {
        return testMethodsId;
    }

    public void setMethodCode(String methodCode) 
    {
        this.methodCode = methodCode;
    }

    public String getMethodCode() 
    {
        return methodCode;
    }

    public void setMethodNo(String methodNo) 
    {
        this.methodNo = methodNo;
    }

    public String getMethodNo() 
    {
        return methodNo;
    }

    public void setMethodName(String methodName) 
    {
        this.methodName = methodName;
    }

    public String getMethodName() 
    {
        return methodName;
    }

    public void setMethodNameEng(String methodNameEng) 
    {
        this.methodNameEng = methodNameEng;
    }

    public String getMethodNameEng() 
    {
        return methodNameEng;
    }

    public void setMethodType(String methodType) 
    {
        this.methodType = methodType;
    }

    public String getMethodType() 
    {
        return methodType;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setClause(String clause) 
    {
        this.clause = clause;
    }

    public String getClause() 
    {
        return clause;
    }

    public void setClauseName(String clauseName) 
    {
        this.clauseName = clauseName;
    }

    public String getClauseName() 
    {
        return clauseName;
    }

    public void setClauseNameEng(String clauseNameEng) 
    {
        this.clauseNameEng = clauseNameEng;
    }

    public String getClauseNameEng() 
    {
        return clauseNameEng;
    }

    public void setIsOrders(String isOrders) 
    {
        this.isOrders = isOrders;
    }

    public String getIsOrders() 
    {
        return isOrders;
    }

    public void setMethodStatus(String methodStatus) 
    {
        this.methodStatus = methodStatus;
    }

    public String getMethodStatus() 
    {
        return methodStatus;
    }

    public void setMethodStatusValue(String methodStatusValue) 
    {
        this.methodStatusValue = methodStatusValue;
    }

    public String getMethodStatusValue() 
    {
        return methodStatusValue;
    }

    public void setMethodDesc(String methodDesc) 
    {
        this.methodDesc = methodDesc;
    }

    public String getMethodDesc() 
    {
        return methodDesc;
    }

    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }

    public void setDetectorAndCondition(String detectorAndCondition) 
    {
        this.detectorAndCondition = detectorAndCondition;
    }

    public String getDetectorAndCondition() 
    {
        return detectorAndCondition;
    }

    public void setEqRemarkAndMethod(String eqRemarkAndMethod) 
    {
        this.eqRemarkAndMethod = eqRemarkAndMethod;
    }

    public String getEqRemarkAndMethod() 
    {
        return eqRemarkAndMethod;
    }

    public void setMethodOverview(String methodOverview) 
    {
        this.methodOverview = methodOverview;
    }

    public String getMethodOverview() 
    {
        return methodOverview;
    }

    public void setTestExplain(String testExplain) 
    {
        this.testExplain = testExplain;
    }

    public String getTestExplain() 
    {
        return testExplain;
    }

    public void setMethodExplain(String methodExplain) 
    {
        this.methodExplain = methodExplain;
    }

    public String getMethodExplain() 
    {
        return methodExplain;
    }

    public void setConsumable(String consumable) 
    {
        this.consumable = consumable;
    }

    public String getConsumable() 
    {
        return consumable;
    }

    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
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
            .append("testMethodsId", getTestMethodsId())
            .append("methodCode", getMethodCode())
            .append("methodNo", getMethodNo())
            .append("methodName", getMethodName())
            .append("methodNameEng", getMethodNameEng())
            .append("methodType", getMethodType())
            .append("status", getStatus())
            .append("clause", getClause())
            .append("clauseName", getClauseName())
            .append("clauseNameEng", getClauseNameEng())
            .append("isOrders", getIsOrders())
            .append("methodStatus", getMethodStatus())
            .append("methodStatusValue", getMethodStatusValue())
            .append("methodDesc", getMethodDesc())
            .append("version", getVersion())
            .append("detectorAndCondition", getDetectorAndCondition())
            .append("eqRemarkAndMethod", getEqRemarkAndMethod())
            .append("methodOverview", getMethodOverview())
            .append("testExplain", getTestExplain())
            .append("methodExplain", getMethodExplain())
            .append("consumable", getConsumable())
            .append("deptId", getDeptId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
