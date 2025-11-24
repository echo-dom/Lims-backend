package com.ruoyi.lims.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 方案项目对象 lims_sp_tests
 * 
 * @author kongdejin
 * @date 2025-11-24
 */
public class SpTests extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long spTestsId;

    /** 原系统ID */
    @Excel(name = "原系统ID")
    private String originalId;

    /** 检测项目ID */
    @Excel(name = "检测项目ID")
    private String testsId;

    /** 执行标准ID */
    @Excel(name = "执行标准ID")
    private String sampleProgramsId;

    /** 项目ID */
    @Excel(name = "项目ID")
    private String projectId;

    /** 执行标准代码 */
    @Excel(name = "执行标准代码")
    private String spCode;

    /** 方案测试名称 */
    @Excel(name = "方案测试名称")
    private String spTestName;

    /** 测试名称 */
    @Excel(name = "测试名称")
    private String testName;

    /** 测试别名 */
    @Excel(name = "测试别名")
    private String testAlias;

    /** 特殊测试名称 */
    @Excel(name = "特殊测试名称")
    private String specialTestName;

    /** 测试分类ID */
    @Excel(name = "测试分类ID")
    private String testCateId;

    /** 测试类型 */
    @Excel(name = "测试类型")
    private String testType;

    /** 方案类型 */
    @Excel(name = "方案类型")
    private String profileType;

    /** 项目代码 */
    @Excel(name = "项目代码")
    private String programCode;

    /** 数量 */
    @Excel(name = "数量")
    private BigDecimal qty;

    /** 数量单位 */
    @Excel(name = "数量单位")
    private String qtyUnits;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** 附加价格 */
    @Excel(name = "附加价格")
    private BigDecimal addPrice;

    /** 价格单位 */
    @Excel(name = "价格单位")
    private String priceUnits;

    /** 标准 */
    @Excel(name = "标准")
    private String criterion;

    /** 测试标准 */
    @Excel(name = "测试标准")
    private String testCriterion;

    /** 评估规则 */
    @Excel(name = "评估规则")
    private String evaluateRule;

    /** COP编号 */
    @Excel(name = "COP编号")
    private String copNo;

    /** 低限A */
    @Excel(name = "低限A")
    private String lowA;

    /** 高限A */
    @Excel(name = "高限A")
    private String highA;

    /** 高限单位 */
    @Excel(name = "高限单位")
    private String highAUnit;

    /** 单位 */
    @Excel(name = "单位")
    private String units;

    /** 文本限制 */
    @Excel(name = "文本限制")
    private String charLimits;

    /** 数据参考 */
    @Excel(name = "数据参考")
    private String dataReference;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 是否退休（0否 1是） */
    @Excel(name = "是否退休", readConverterExp = "0=否,1=是")
    private String isRetire;

    /** 是否主项目（0否 1是） */
    @Excel(name = "是否主项目", readConverterExp = "0=否,1=是")
    private String isMainPro;

    /** 冻结标志（0未冻结 1已冻结） */
    @Excel(name = "冻结标志", readConverterExp = "0=未冻结,1=已冻结")
    private String freezeFlag;

    /** 默认测试 */
    @Excel(name = "默认测试")
    private String defaultTest;

    /** 审核标志 */
    @Excel(name = "审核标志")
    private String auditFlag;

    /** 审核级别 */
    @Excel(name = "审核级别")
    private String auditLevel;

    /** 行审核 */
    @Excel(name = "行审核")
    private String rowAudit;

    /** 显示状态 */
    @Excel(name = "显示状态")
    private String dispStatus;

    /** 报告类型 */
    @Excel(name = "报告类型")
    private String reportType;

    /** 报告备注 */
    @Excel(name = "报告备注")
    private String reportRemark;

    /** 抽样计划 */
    @Excel(name = "抽样计划")
    private String drawPlan;

    /** 部门 */
    @Excel(name = "部门")
    private String dept;

    /** 成本中心ID */
    @Excel(name = "成本中心ID")
    private String ccId;

    /** 提交公司 */
    @Excel(name = "提交公司")
    private String submitCorp;

    /** 特殊组名称 */
    @Excel(name = "特殊组名称")
    private String specialGroupName;

    /** 主组汇总 */
    @Excel(name = "主组汇总")
    private String mainGroupZum;

    /** 组编号 */
    @Excel(name = "组编号")
    private String groupNums;

    /** 开始使用日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始使用日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startUseDate;

    /** 到期日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "到期日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expirationDate;

    /** 版本 */
    @Excel(name = "版本")
    private String version;

    /** 方案描述 */
    @Excel(name = "方案描述")
    private String profile;

    /** 说明描述 */
    @Excel(name = "说明描述")
    private String explainDesc;

    /** 备注说明 */
    @Excel(name = "备注说明")
    private String comments;

    /** 规格分析物备注 */
    @Excel(name = "规格分析物备注")
    private String specAnalytesComments;

    /** 工作流ID */
    @Excel(name = "工作流ID")
    private String workflowId;

    /** 排序 */
    @Excel(name = "排序")
    private Long sorter;

    /** 记录者描述 */
    @Excel(name = "记录者描述")
    private String recorderDesc;

    /** 审核人代码 */
    @Excel(name = "审核人代码")
    private String auditorCode;

    /** 审核人描述 */
    @Excel(name = "审核人描述")
    private String auditorDesc;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date auditTime;

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

    public void setSpTestsId(Long spTestsId) 
    {
        this.spTestsId = spTestsId;
    }

    public Long getSpTestsId() 
    {
        return spTestsId;
    }

    public void setOriginalId(String originalId) 
    {
        this.originalId = originalId;
    }

    public String getOriginalId() 
    {
        return originalId;
    }

    public void setTestsId(String testsId) 
    {
        this.testsId = testsId;
    }

    public String getTestsId() 
    {
        return testsId;
    }

    public void setSampleProgramsId(String sampleProgramsId) 
    {
        this.sampleProgramsId = sampleProgramsId;
    }

    public String getSampleProgramsId() 
    {
        return sampleProgramsId;
    }

    public void setProjectId(String projectId) 
    {
        this.projectId = projectId;
    }

    public String getProjectId() 
    {
        return projectId;
    }

    public void setSpCode(String spCode) 
    {
        this.spCode = spCode;
    }

    public String getSpCode() 
    {
        return spCode;
    }

    public void setSpTestName(String spTestName) 
    {
        this.spTestName = spTestName;
    }

    public String getSpTestName() 
    {
        return spTestName;
    }

    public void setTestName(String testName) 
    {
        this.testName = testName;
    }

    public String getTestName() 
    {
        return testName;
    }

    public void setTestAlias(String testAlias) 
    {
        this.testAlias = testAlias;
    }

    public String getTestAlias() 
    {
        return testAlias;
    }

    public void setSpecialTestName(String specialTestName) 
    {
        this.specialTestName = specialTestName;
    }

    public String getSpecialTestName() 
    {
        return specialTestName;
    }

    public void setTestCateId(String testCateId) 
    {
        this.testCateId = testCateId;
    }

    public String getTestCateId() 
    {
        return testCateId;
    }

    public void setTestType(String testType) 
    {
        this.testType = testType;
    }

    public String getTestType() 
    {
        return testType;
    }

    public void setProfileType(String profileType) 
    {
        this.profileType = profileType;
    }

    public String getProfileType() 
    {
        return profileType;
    }

    public void setProgramCode(String programCode) 
    {
        this.programCode = programCode;
    }

    public String getProgramCode() 
    {
        return programCode;
    }

    public void setQty(BigDecimal qty) 
    {
        this.qty = qty;
    }

    public BigDecimal getQty() 
    {
        return qty;
    }

    public void setQtyUnits(String qtyUnits) 
    {
        this.qtyUnits = qtyUnits;
    }

    public String getQtyUnits() 
    {
        return qtyUnits;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setAddPrice(BigDecimal addPrice) 
    {
        this.addPrice = addPrice;
    }

    public BigDecimal getAddPrice() 
    {
        return addPrice;
    }

    public void setPriceUnits(String priceUnits) 
    {
        this.priceUnits = priceUnits;
    }

    public String getPriceUnits() 
    {
        return priceUnits;
    }

    public void setCriterion(String criterion) 
    {
        this.criterion = criterion;
    }

    public String getCriterion() 
    {
        return criterion;
    }

    public void setTestCriterion(String testCriterion) 
    {
        this.testCriterion = testCriterion;
    }

    public String getTestCriterion() 
    {
        return testCriterion;
    }

    public void setEvaluateRule(String evaluateRule) 
    {
        this.evaluateRule = evaluateRule;
    }

    public String getEvaluateRule() 
    {
        return evaluateRule;
    }

    public void setCopNo(String copNo) 
    {
        this.copNo = copNo;
    }

    public String getCopNo() 
    {
        return copNo;
    }

    public void setLowA(String lowA) 
    {
        this.lowA = lowA;
    }

    public String getLowA() 
    {
        return lowA;
    }

    public void setHighA(String highA) 
    {
        this.highA = highA;
    }

    public String getHighA() 
    {
        return highA;
    }

    public void setHighAUnit(String highAUnit) 
    {
        this.highAUnit = highAUnit;
    }

    public String getHighAUnit() 
    {
        return highAUnit;
    }

    public void setUnits(String units) 
    {
        this.units = units;
    }

    public String getUnits() 
    {
        return units;
    }

    public void setCharLimits(String charLimits) 
    {
        this.charLimits = charLimits;
    }

    public String getCharLimits() 
    {
        return charLimits;
    }

    public void setDataReference(String dataReference) 
    {
        this.dataReference = dataReference;
    }

    public String getDataReference() 
    {
        return dataReference;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setIsRetire(String isRetire) 
    {
        this.isRetire = isRetire;
    }

    public String getIsRetire() 
    {
        return isRetire;
    }

    public void setIsMainPro(String isMainPro) 
    {
        this.isMainPro = isMainPro;
    }

    public String getIsMainPro() 
    {
        return isMainPro;
    }

    public void setFreezeFlag(String freezeFlag) 
    {
        this.freezeFlag = freezeFlag;
    }

    public String getFreezeFlag() 
    {
        return freezeFlag;
    }

    public void setDefaultTest(String defaultTest) 
    {
        this.defaultTest = defaultTest;
    }

    public String getDefaultTest() 
    {
        return defaultTest;
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

    public void setDispStatus(String dispStatus) 
    {
        this.dispStatus = dispStatus;
    }

    public String getDispStatus() 
    {
        return dispStatus;
    }

    public void setReportType(String reportType) 
    {
        this.reportType = reportType;
    }

    public String getReportType() 
    {
        return reportType;
    }

    public void setReportRemark(String reportRemark) 
    {
        this.reportRemark = reportRemark;
    }

    public String getReportRemark() 
    {
        return reportRemark;
    }

    public void setDrawPlan(String drawPlan) 
    {
        this.drawPlan = drawPlan;
    }

    public String getDrawPlan() 
    {
        return drawPlan;
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

    public void setSpecialGroupName(String specialGroupName) 
    {
        this.specialGroupName = specialGroupName;
    }

    public String getSpecialGroupName() 
    {
        return specialGroupName;
    }

    public void setMainGroupZum(String mainGroupZum) 
    {
        this.mainGroupZum = mainGroupZum;
    }

    public String getMainGroupZum() 
    {
        return mainGroupZum;
    }

    public void setGroupNums(String groupNums) 
    {
        this.groupNums = groupNums;
    }

    public String getGroupNums() 
    {
        return groupNums;
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

    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }

    public void setProfile(String profile) 
    {
        this.profile = profile;
    }

    public String getProfile() 
    {
        return profile;
    }

    public void setExplainDesc(String explainDesc) 
    {
        this.explainDesc = explainDesc;
    }

    public String getExplainDesc() 
    {
        return explainDesc;
    }

    public void setComments(String comments) 
    {
        this.comments = comments;
    }

    public String getComments() 
    {
        return comments;
    }

    public void setSpecAnalytesComments(String specAnalytesComments) 
    {
        this.specAnalytesComments = specAnalytesComments;
    }

    public String getSpecAnalytesComments() 
    {
        return specAnalytesComments;
    }

    public void setWorkflowId(String workflowId) 
    {
        this.workflowId = workflowId;
    }

    public String getWorkflowId() 
    {
        return workflowId;
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

    public void setAuditorCode(String auditorCode) 
    {
        this.auditorCode = auditorCode;
    }

    public String getAuditorCode() 
    {
        return auditorCode;
    }

    public void setAuditorDesc(String auditorDesc) 
    {
        this.auditorDesc = auditorDesc;
    }

    public String getAuditorDesc() 
    {
        return auditorDesc;
    }

    public void setAuditTime(Date auditTime) 
    {
        this.auditTime = auditTime;
    }

    public Date getAuditTime() 
    {
        return auditTime;
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
            .append("spTestsId", getSpTestsId())
            .append("originalId", getOriginalId())
            .append("testsId", getTestsId())
            .append("sampleProgramsId", getSampleProgramsId())
            .append("projectId", getProjectId())
            .append("spCode", getSpCode())
            .append("spTestName", getSpTestName())
            .append("testName", getTestName())
            .append("testAlias", getTestAlias())
            .append("specialTestName", getSpecialTestName())
            .append("testCateId", getTestCateId())
            .append("testType", getTestType())
            .append("profileType", getProfileType())
            .append("programCode", getProgramCode())
            .append("qty", getQty())
            .append("qtyUnits", getQtyUnits())
            .append("price", getPrice())
            .append("addPrice", getAddPrice())
            .append("priceUnits", getPriceUnits())
            .append("criterion", getCriterion())
            .append("testCriterion", getTestCriterion())
            .append("evaluateRule", getEvaluateRule())
            .append("copNo", getCopNo())
            .append("lowA", getLowA())
            .append("highA", getHighA())
            .append("highAUnit", getHighAUnit())
            .append("units", getUnits())
            .append("charLimits", getCharLimits())
            .append("dataReference", getDataReference())
            .append("status", getStatus())
            .append("isRetire", getIsRetire())
            .append("isMainPro", getIsMainPro())
            .append("freezeFlag", getFreezeFlag())
            .append("defaultTest", getDefaultTest())
            .append("auditFlag", getAuditFlag())
            .append("auditLevel", getAuditLevel())
            .append("rowAudit", getRowAudit())
            .append("dispStatus", getDispStatus())
            .append("reportType", getReportType())
            .append("reportRemark", getReportRemark())
            .append("drawPlan", getDrawPlan())
            .append("dept", getDept())
            .append("ccId", getCcId())
            .append("submitCorp", getSubmitCorp())
            .append("specialGroupName", getSpecialGroupName())
            .append("mainGroupZum", getMainGroupZum())
            .append("groupNums", getGroupNums())
            .append("startUseDate", getStartUseDate())
            .append("expirationDate", getExpirationDate())
            .append("version", getVersion())
            .append("profile", getProfile())
            .append("explainDesc", getExplainDesc())
            .append("comments", getComments())
            .append("specAnalytesComments", getSpecAnalytesComments())
            .append("workflowId", getWorkflowId())
            .append("sorter", getSorter())
            .append("recorderDesc", getRecorderDesc())
            .append("auditorCode", getAuditorCode())
            .append("auditorDesc", getAuditorDesc())
            .append("auditTime", getAuditTime())
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
