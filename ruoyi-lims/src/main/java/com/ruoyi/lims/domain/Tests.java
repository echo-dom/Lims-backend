package com.ruoyi.lims.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试项目对象 lims_tests
 * 
 * @author kongdejin
 * @date 2025-11-24
 */
public class Tests extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long testId;

    /** 原系统ID */
    @Excel(name = "原系统ID")
    private String originalId;

    /** 测试代码 */
    @Excel(name = "测试代码")
    private String testCode;

    /** 测试名称 */
    @Excel(name = "测试名称")
    private String testName;

    /** GC测试名称 */
    @Excel(name = "GC测试名称")
    private String gcTestName;

    /** 原始代码 */
    @Excel(name = "原始代码")
    private String originalCode;

    /** 领域ID */
    @Excel(name = "领域ID")
    private String domainId;

    /** 测试分类ID */
    @Excel(name = "测试分类ID")
    private String testCategoryId;

    /** 测试分类名称 */
    @Excel(name = "测试分类名称")
    private String testCateName;

    /** 完整类型 */
    @Excel(name = "完整类型")
    private String fullType;

    /** 测试分组 */
    @Excel(name = "测试分组")
    private String testGroup;

    /** 报告中名称 */
    @Excel(name = "报告中名称")
    private String nameInReport;

    /** 拼音简写 */
    @Excel(name = "拼音简写")
    private String spellSimplify;

    /** 报告测试编号 */
    @Excel(name = "报告测试编号")
    private String reportTestNo;

    /** 测试项目 */
    @Excel(name = "测试项目")
    private String testItems;

    /** 测试说明 */
    @Excel(name = "测试说明")
    private String testExplain;

    /** 抽样方法 */
    @Excel(name = "抽样方法")
    private String samplingMethod;

    /** 测试价格 */
    @Excel(name = "测试价格")
    private BigDecimal tPrice;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** CMA认证 */
    @Excel(name = "CMA认证")
    private String cma;

    /** CNAS认证 */
    @Excel(name = "CNAS认证")
    private String cnas;

    /** 部门 */
    @Excel(name = "部门")
    private String dept;

    /** 成本中心ID */
    @Excel(name = "成本中心ID")
    private String ccId;

    /** 提交公司 */
    @Excel(name = "提交公司")
    private String submitCorp;

    /** 环境样品保存代码 */
    @Excel(name = "环境样品保存代码")
    private String envSampleSaveCode;

    /** 环境样品保存条件 */
    @Excel(name = "环境样品保存条件")
    private String envSampleSaveCon;

    /** 环境样品保存日期 */
    @Excel(name = "环境样品保存日期")
    private String envSampleSaveDate;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 冻结标志（0未冻结 1已冻结） */
    @Excel(name = "冻结标志", readConverterExp = "0=未冻结,1=已冻结")
    private String freezeFlag;

    /** 显示状态 */
    @Excel(name = "显示状态")
    private String dispStatus;

    /** WSW标志 */
    @Excel(name = "WSW标志")
    private String wswFlag;

    /** 审核标志 */
    @Excel(name = "审核标志")
    private String auditFlag;

    /** 审核级别 */
    @Excel(name = "审核级别")
    private String auditLevel;

    /** 行审核 */
    @Excel(name = "行审核")
    private String rowAudit;

    /** 审核人代码 */
    @Excel(name = "审核人代码")
    private String auditorCode;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date auditTime;

    /** 工作流ID */
    @Excel(name = "工作流ID")
    private String workflowId;

    /** 版本 */
    @Excel(name = "版本")
    private String version;

    /** 排序 */
    @Excel(name = "排序")
    private Long sorter;

    /** 记录者描述 */
    @Excel(name = "记录者描述")
    private String recorderDesc;

    /** 历史人员 */
    @Excel(name = "历史人员")
    private String historyPerson;

    /** 添加人员 */
    @Excel(name = "添加人员")
    private String addPerson;

    /** 添加日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "添加日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addDate;

    /** 冻结人代码 */
    @Excel(name = "冻结人代码")
    private String freezerCode;

    /** 冻结人描述 */
    @Excel(name = "冻结人描述")
    private String freezerDesc;

    /** 冻结时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "冻结时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date freezeTime;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setTestId(Long testId) 
    {
        this.testId = testId;
    }

    public Long getTestId() 
    {
        return testId;
    }

    public void setOriginalId(String originalId) 
    {
        this.originalId = originalId;
    }

    public String getOriginalId() 
    {
        return originalId;
    }

    public void setTestCode(String testCode) 
    {
        this.testCode = testCode;
    }

    public String getTestCode() 
    {
        return testCode;
    }

    public void setTestName(String testName) 
    {
        this.testName = testName;
    }

    public String getTestName() 
    {
        return testName;
    }

    public void setGcTestName(String gcTestName) 
    {
        this.gcTestName = gcTestName;
    }

    public String getGcTestName() 
    {
        return gcTestName;
    }

    public void setOriginalCode(String originalCode) 
    {
        this.originalCode = originalCode;
    }

    public String getOriginalCode() 
    {
        return originalCode;
    }

    public void setDomainId(String domainId) 
    {
        this.domainId = domainId;
    }

    public String getDomainId() 
    {
        return domainId;
    }

    public void setTestCategoryId(String testCategoryId) 
    {
        this.testCategoryId = testCategoryId;
    }

    public String getTestCategoryId() 
    {
        return testCategoryId;
    }

    public void setTestCateName(String testCateName) 
    {
        this.testCateName = testCateName;
    }

    public String getTestCateName() 
    {
        return testCateName;
    }

    public void setFullType(String fullType) 
    {
        this.fullType = fullType;
    }

    public String getFullType() 
    {
        return fullType;
    }

    public void setTestGroup(String testGroup) 
    {
        this.testGroup = testGroup;
    }

    public String getTestGroup() 
    {
        return testGroup;
    }

    public void setNameInReport(String nameInReport) 
    {
        this.nameInReport = nameInReport;
    }

    public String getNameInReport() 
    {
        return nameInReport;
    }

    public void setSpellSimplify(String spellSimplify) 
    {
        this.spellSimplify = spellSimplify;
    }

    public String getSpellSimplify() 
    {
        return spellSimplify;
    }

    public void setReportTestNo(String reportTestNo) 
    {
        this.reportTestNo = reportTestNo;
    }

    public String getReportTestNo() 
    {
        return reportTestNo;
    }

    public void setTestItems(String testItems) 
    {
        this.testItems = testItems;
    }

    public String getTestItems() 
    {
        return testItems;
    }

    public void setTestExplain(String testExplain) 
    {
        this.testExplain = testExplain;
    }

    public String getTestExplain() 
    {
        return testExplain;
    }

    public void setSamplingMethod(String samplingMethod) 
    {
        this.samplingMethod = samplingMethod;
    }

    public String getSamplingMethod() 
    {
        return samplingMethod;
    }

    public void settPrice(BigDecimal tPrice) 
    {
        this.tPrice = tPrice;
    }

    public BigDecimal gettPrice() 
    {
        return tPrice;
    }

    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }

    public void setCma(String cma) 
    {
        this.cma = cma;
    }

    public String getCma() 
    {
        return cma;
    }

    public void setCnas(String cnas) 
    {
        this.cnas = cnas;
    }

    public String getCnas() 
    {
        return cnas;
    }

    public void setDept(String dept) 
    {
        this.dept = dept;
    }

    public String getDept() 
    {
        return dept;
    }

    public void setCcId(String ccId) 
    {
        this.ccId = ccId;
    }

    public String getCcId() 
    {
        return ccId;
    }

    public void setSubmitCorp(String submitCorp) 
    {
        this.submitCorp = submitCorp;
    }

    public String getSubmitCorp() 
    {
        return submitCorp;
    }

    public void setEnvSampleSaveCode(String envSampleSaveCode) 
    {
        this.envSampleSaveCode = envSampleSaveCode;
    }

    public String getEnvSampleSaveCode() 
    {
        return envSampleSaveCode;
    }

    public void setEnvSampleSaveCon(String envSampleSaveCon) 
    {
        this.envSampleSaveCon = envSampleSaveCon;
    }

    public String getEnvSampleSaveCon() 
    {
        return envSampleSaveCon;
    }

    public void setEnvSampleSaveDate(String envSampleSaveDate) 
    {
        this.envSampleSaveDate = envSampleSaveDate;
    }

    public String getEnvSampleSaveDate() 
    {
        return envSampleSaveDate;
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

    public void setDispStatus(String dispStatus) 
    {
        this.dispStatus = dispStatus;
    }

    public String getDispStatus() 
    {
        return dispStatus;
    }

    public void setWswFlag(String wswFlag) 
    {
        this.wswFlag = wswFlag;
    }

    public String getWswFlag() 
    {
        return wswFlag;
    }

    public void setAuditFlag(String auditFlag) 
    {
        this.auditFlag = auditFlag;
    }

    public String getAuditFlag() 
    {
        return auditFlag;
    }

    public void setAuditLevel(String auditLevel) 
    {
        this.auditLevel = auditLevel;
    }

    public String getAuditLevel() 
    {
        return auditLevel;
    }

    public void setRowAudit(String rowAudit) 
    {
        this.rowAudit = rowAudit;
    }

    public String getRowAudit() 
    {
        return rowAudit;
    }

    public void setAuditorCode(String auditorCode) 
    {
        this.auditorCode = auditorCode;
    }

    public String getAuditorCode() 
    {
        return auditorCode;
    }

    public void setAuditTime(Date auditTime) 
    {
        this.auditTime = auditTime;
    }

    public Date getAuditTime() 
    {
        return auditTime;
    }

    public void setWorkflowId(String workflowId) 
    {
        this.workflowId = workflowId;
    }

    public String getWorkflowId() 
    {
        return workflowId;
    }

    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }

    public void setSorter(Long sorter) 
    {
        this.sorter = sorter;
    }

    public Long getSorter() 
    {
        return sorter;
    }

    public void setRecorderDesc(String recorderDesc) 
    {
        this.recorderDesc = recorderDesc;
    }

    public String getRecorderDesc() 
    {
        return recorderDesc;
    }

    public void setHistoryPerson(String historyPerson) 
    {
        this.historyPerson = historyPerson;
    }

    public String getHistoryPerson() 
    {
        return historyPerson;
    }

    public void setAddPerson(String addPerson) 
    {
        this.addPerson = addPerson;
    }

    public String getAddPerson() 
    {
        return addPerson;
    }

    public void setAddDate(Date addDate) 
    {
        this.addDate = addDate;
    }

    public Date getAddDate() 
    {
        return addDate;
    }

    public void setFreezerCode(String freezerCode) 
    {
        this.freezerCode = freezerCode;
    }

    public String getFreezerCode() 
    {
        return freezerCode;
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
            .append("testId", getTestId())
            .append("originalId", getOriginalId())
            .append("testCode", getTestCode())
            .append("testName", getTestName())
            .append("gcTestName", getGcTestName())
            .append("originalCode", getOriginalCode())
            .append("domainId", getDomainId())
            .append("testCategoryId", getTestCategoryId())
            .append("testCateName", getTestCateName())
            .append("fullType", getFullType())
            .append("testGroup", getTestGroup())
            .append("nameInReport", getNameInReport())
            .append("spellSimplify", getSpellSimplify())
            .append("reportTestNo", getReportTestNo())
            .append("testItems", getTestItems())
            .append("testExplain", getTestExplain())
            .append("samplingMethod", getSamplingMethod())
            .append("tPrice", gettPrice())
            .append("unit", getUnit())
            .append("cma", getCma())
            .append("cnas", getCnas())
            .append("dept", getDept())
            .append("ccId", getCcId())
            .append("submitCorp", getSubmitCorp())
            .append("envSampleSaveCode", getEnvSampleSaveCode())
            .append("envSampleSaveCon", getEnvSampleSaveCon())
            .append("envSampleSaveDate", getEnvSampleSaveDate())
            .append("status", getStatus())
            .append("freezeFlag", getFreezeFlag())
            .append("dispStatus", getDispStatus())
            .append("wswFlag", getWswFlag())
            .append("auditFlag", getAuditFlag())
            .append("auditLevel", getAuditLevel())
            .append("rowAudit", getRowAudit())
            .append("auditorCode", getAuditorCode())
            .append("auditTime", getAuditTime())
            .append("workflowId", getWorkflowId())
            .append("version", getVersion())
            .append("sorter", getSorter())
            .append("recorderDesc", getRecorderDesc())
            .append("historyPerson", getHistoryPerson())
            .append("addPerson", getAddPerson())
            .append("addDate", getAddDate())
            .append("freezerCode", getFreezerCode())
            .append("freezerDesc", getFreezerDesc())
            .append("freezeTime", getFreezeTime())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
