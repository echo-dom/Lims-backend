package com.ruoyi.lims.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * LIMS样品对象 lims_sample
 * 
 * @author kongdejin
 * @date 2025-06-05
 */
public class Sample extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 样品ID */
    @JsonSerialize(using = ToStringSerializer.class)
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

    /** 来源文件夹编号 */
    @Excel(name = "来源文件夹编号")
    private String fromFolderNo;

    /** 任务状态 */
    @Excel(name = "任务状态")
    private String taskStatus;

    /** 开案人描述 */
    @Excel(name = "开案人描述")
    private String auditorDesc;

    /** 开案时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "开案时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    /** 退回原因 */
    @Excel(name = "退回原因")
    private String returnReason;

    /** 退回人 */
    @Excel(name = "退回人")
    private String returnPerson;

    /** 退回时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "退回时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date returnTime;

    /** 原始记录名称 */
    @Excel(name = "原始记录名称")
    private String originalRecordName;

    /** 收款状态 */
    @Excel(name = "收款状态")
    private String paymentStatus;

    /** 主项目数 */
    @Excel(name = "主项目数")
    private String mainProNum;

    /** 地址编码 */
    private String addressCode;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setSampleId(Long sampleId) {
        this.sampleId = sampleId;
    }

    public Long getSampleId() {
        return sampleId;
    }

    public void setSampleCode(String sampleCode) {
        this.sampleCode = sampleCode;
    }

    public String getSampleCode() {
        return sampleCode;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleTypeId(Long sampleTypeId) {
        this.sampleTypeId = sampleTypeId;
    }

    public Long getSampleTypeId() {
        return sampleTypeId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setSamplingDate(Date samplingDate) {
        this.samplingDate = samplingDate;
    }

    public Date getSamplingDate() {
        return samplingDate;
    }

    public void setSamplingLocation(String samplingLocation) {
        this.samplingLocation = samplingLocation;
    }

    public String getSamplingLocation() {
        return samplingLocation;
    }

    public void setSampleStatus(String sampleStatus) {
        this.sampleStatus = sampleStatus;
    }

    public String getSampleStatus() {
        return sampleStatus;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setFromFolderNo(String fromFolderNo) {
        this.fromFolderNo = fromFolderNo;
    }

    public String getFromFolderNo() {
        return fromFolderNo;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setAuditorDesc(String auditorDesc) {
        this.auditorDesc = auditorDesc;
    }

    public String getAuditorDesc() {
        return auditorDesc;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnPerson(String returnPerson) {
        this.returnPerson = returnPerson;
    }

    public String getReturnPerson() {
        return returnPerson;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setOriginalRecordName(String originalRecordName) {
        this.originalRecordName = originalRecordName;
    }

    public String getOriginalRecordName() {
        return originalRecordName;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setMainProNum(String mainProNum) {
        this.mainProNum = mainProNum;
    }

    public String getMainProNum() {
        return mainProNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
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
                .append("fromFolderNo", getFromFolderNo())
                .append("taskStatus", getTaskStatus())
                .append("auditorDesc", getAuditorDesc())
                .append("auditTime", getAuditTime())
                .append("returnReason", getReturnReason())
                .append("returnPerson", getReturnPerson())
                .append("returnTime", getReturnTime())
                .append("originalRecordName", getOriginalRecordName())
                .append("paymentStatus", getPaymentStatus())
                .append("mainProNum", getMainProNum())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
