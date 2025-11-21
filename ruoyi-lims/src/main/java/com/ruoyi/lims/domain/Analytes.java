package com.ruoyi.lims.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分析项目定义对象 lims_analytes
 * 
 * @author kongdejin
 * @date 2025-06-17
 */
public class Analytes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 分析项ID，主键 */
    private String analytesid;

    /** 所属检测项目ID */
    @Excel(name = "所属检测项目ID")
    private String testsid;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sorter;

    /** 分析项目名称 */
    @Excel(name = "分析项目名称")
    private String analyte;

    /** 别名 */
    @Excel(name = "别名")
    private String sinonym;

    /** 修约 */
    @Excel(name = "修约")
    private String picture;

    /** 计量单位 */
    @Excel(name = "计量单位")
    private String units;

    /** 重复数 */
    @Excel(name = "重复数")
    private Long repnum;

    /** 分析项类型：0=数字型，1=字符型，2=通用函数 */
    @Excel(name = "分析项类型：0=数字型，1=字符型，2=通用函数")
    private Long analyteype;

    /** 报告显示 */
    @Excel(name = "报告显示")
    private Long displayflag;

    /** 是否科学计数 */
    @Excel(name = "是否科学计数")
    private Long scientflag;

    /** 低限 */
    @Excel(name = "低限")
    private String low;

    /** 高限 */
    @Excel(name = "高限")
    private String high;

    /** 版本 */
    @Excel(name = "版本")
    private String version;

    /** 是否称重（天平采集） */
    @Excel(name = "是否称重", readConverterExp = "天=平采集")
    private String isweight;

    /** 公式名称 */
    @Excel(name = "公式名称")
    private String calcname;

    /** 检测项目编码 */
    @Excel(name = "检测项目编码")
    private String testcode;

    /** 检出限单位 */
    @Excel(name = "检出限单位")
    private String lowUnit;

    /** 定量限 */
    @Excel(name = "定量限")
    private String quantificationLimit;

    /** 定量限单位 */
    @Excel(name = "定量限单位")
    private String qltUnit;

    /** 纠正因子系数 */
    @Excel(name = "纠正因子系数")
    private String correctionfactor;

    /** 稀释倍数 */
    @Excel(name = "稀释倍数")
    private String dilutionrate;

    /** 定容体积 */
    @Excel(name = "定容体积")
    private String volume;

    /** 方法中规定的检出限说明 */
    @Excel(name = "方法中规定的检出限说明")
    private String validlimitrem;

    /** 检验方法 */
    @Excel(name = "检验方法")
    private String method;

    /** 类型 */
    @Excel(name = "类型")
    private String analtype;

    /** 分析项备注 */
    @Excel(name = "分析项备注")
    private String analyteremark;

    /** 分析项目英文名 */
    @Excel(name = "分析项目英文名")
    private String analyteEn;

    /** 分析项目别名英文名 */
    @Excel(name = "分析项目别名英文名")
    private String sinonymEn;

    /** 分析项目编码 */
    @Excel(name = "分析项目编码")
    private String analytescode;

    /** 公式文本 */
    @Excel(name = "公式文本")
    private String formulatext;

    /** 指标 */
    @Excel(name = "指标")
    private String zb;

    /** 数据转换格式 */
    @Excel(name = "数据转换格式")
    private String datareference;

    /** 是否科学计数 */
    @Excel(name = "是否科学计数")
    private String scientific;

    /** 未检出标志 */
    @Excel(name = "未检出标志")
    private Long ltdflag;

    /** 未检出标志字符串 */
    @Excel(name = "未检出标志字符串")
    private String ltdflagc;

    /** 是否现场采集 */
    @Excel(name = "是否现场采集")
    private Long isscene;

    /** 未检出备注 */
    @Excel(name = "未检出备注")
    private String notdetectedremark;

    /** 方法备注 */
    @Excel(name = "方法备注")
    private String testremark;

    /** 是否公式显示 */
    @Excel(name = "是否公式显示")
    private Long isformula;

    /** 报告备注 */
    @Excel(name = "报告备注")
    private String reportremark;

    /** 判定规则 */
    @Excel(name = "判定规则")
    private String decisionrules;

    /** 不在原始记录中显示 */
    @Excel(name = "不在原始记录中显示")
    private Long orinodisplayflag;

    public void setAnalytesid(String analytesid) 
    {
        this.analytesid = analytesid;
    }

    public String getAnalytesid() 
    {
        return analytesid;
    }

    public void setTestsid(String testsid) 
    {
        this.testsid = testsid;
    }

    public String getTestsid() 
    {
        return testsid;
    }

    public void setSorter(Long sorter) 
    {
        this.sorter = sorter;
    }

    public Long getSorter() 
    {
        return sorter;
    }

    public void setAnalyte(String analyte) 
    {
        this.analyte = analyte;
    }

    public String getAnalyte() 
    {
        return analyte;
    }

    public void setSinonym(String sinonym) 
    {
        this.sinonym = sinonym;
    }

    public String getSinonym() 
    {
        return sinonym;
    }

    public void setPicture(String picture) 
    {
        this.picture = picture;
    }

    public String getPicture() 
    {
        return picture;
    }

    public void setUnits(String units) 
    {
        this.units = units;
    }

    public String getUnits() 
    {
        return units;
    }

    public void setRepnum(Long repnum) 
    {
        this.repnum = repnum;
    }

    public Long getRepnum() 
    {
        return repnum;
    }

    public void setAnalyteype(Long analyteype) 
    {
        this.analyteype = analyteype;
    }

    public Long getAnalyteype() 
    {
        return analyteype;
    }

    public void setDisplayflag(Long displayflag) 
    {
        this.displayflag = displayflag;
    }

    public Long getDisplayflag() 
    {
        return displayflag;
    }

    public void setScientflag(Long scientflag) 
    {
        this.scientflag = scientflag;
    }

    public Long getScientflag() 
    {
        return scientflag;
    }

    public void setLow(String low) 
    {
        this.low = low;
    }

    public String getLow() 
    {
        return low;
    }

    public void setHigh(String high) 
    {
        this.high = high;
    }

    public String getHigh() 
    {
        return high;
    }

    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }

    public void setIsweight(String isweight) 
    {
        this.isweight = isweight;
    }

    public String getIsweight() 
    {
        return isweight;
    }

    public void setCalcname(String calcname) 
    {
        this.calcname = calcname;
    }

    public String getCalcname() 
    {
        return calcname;
    }

    public void setTestcode(String testcode) 
    {
        this.testcode = testcode;
    }

    public String getTestcode() 
    {
        return testcode;
    }

    public void setLowUnit(String lowUnit) 
    {
        this.lowUnit = lowUnit;
    }

    public String getLowUnit() 
    {
        return lowUnit;
    }

    public void setQuantificationLimit(String quantificationLimit) 
    {
        this.quantificationLimit = quantificationLimit;
    }

    public String getQuantificationLimit() 
    {
        return quantificationLimit;
    }

    public void setQltUnit(String qltUnit) 
    {
        this.qltUnit = qltUnit;
    }

    public String getQltUnit() 
    {
        return qltUnit;
    }

    public void setCorrectionfactor(String correctionfactor) 
    {
        this.correctionfactor = correctionfactor;
    }

    public String getCorrectionfactor() 
    {
        return correctionfactor;
    }

    public void setDilutionrate(String dilutionrate) 
    {
        this.dilutionrate = dilutionrate;
    }

    public String getDilutionrate() 
    {
        return dilutionrate;
    }

    public void setVolume(String volume) 
    {
        this.volume = volume;
    }

    public String getVolume() 
    {
        return volume;
    }

    public void setValidlimitrem(String validlimitrem) 
    {
        this.validlimitrem = validlimitrem;
    }

    public String getValidlimitrem() 
    {
        return validlimitrem;
    }

    public void setMethod(String method) 
    {
        this.method = method;
    }

    public String getMethod() 
    {
        return method;
    }

    public void setAnaltype(String analtype) 
    {
        this.analtype = analtype;
    }

    public String getAnaltype() 
    {
        return analtype;
    }

    public void setAnalyteremark(String analyteremark) 
    {
        this.analyteremark = analyteremark;
    }

    public String getAnalyteremark() 
    {
        return analyteremark;
    }

    public void setAnalyteEn(String analyteEn) 
    {
        this.analyteEn = analyteEn;
    }

    public String getAnalyteEn() 
    {
        return analyteEn;
    }

    public void setSinonymEn(String sinonymEn) 
    {
        this.sinonymEn = sinonymEn;
    }

    public String getSinonymEn() 
    {
        return sinonymEn;
    }

    public void setAnalytescode(String analytescode) 
    {
        this.analytescode = analytescode;
    }

    public String getAnalytescode() 
    {
        return analytescode;
    }

    public void setFormulatext(String formulatext) 
    {
        this.formulatext = formulatext;
    }

    public String getFormulatext() 
    {
        return formulatext;
    }

    public void setZb(String zb) 
    {
        this.zb = zb;
    }

    public String getZb() 
    {
        return zb;
    }

    public void setDatareference(String datareference) 
    {
        this.datareference = datareference;
    }

    public String getDatareference() 
    {
        return datareference;
    }

    public void setScientific(String scientific) 
    {
        this.scientific = scientific;
    }

    public String getScientific() 
    {
        return scientific;
    }

    public void setLtdflag(Long ltdflag) 
    {
        this.ltdflag = ltdflag;
    }

    public Long getLtdflag() 
    {
        return ltdflag;
    }

    public void setLtdflagc(String ltdflagc) 
    {
        this.ltdflagc = ltdflagc;
    }

    public String getLtdflagc() 
    {
        return ltdflagc;
    }

    public void setIsscene(Long isscene) 
    {
        this.isscene = isscene;
    }

    public Long getIsscene() 
    {
        return isscene;
    }

    public void setNotdetectedremark(String notdetectedremark) 
    {
        this.notdetectedremark = notdetectedremark;
    }

    public String getNotdetectedremark() 
    {
        return notdetectedremark;
    }

    public void setTestremark(String testremark) 
    {
        this.testremark = testremark;
    }

    public String getTestremark() 
    {
        return testremark;
    }

    public void setIsformula(Long isformula) 
    {
        this.isformula = isformula;
    }

    public Long getIsformula() 
    {
        return isformula;
    }

    public void setReportremark(String reportremark) 
    {
        this.reportremark = reportremark;
    }

    public String getReportremark() 
    {
        return reportremark;
    }

    public void setDecisionrules(String decisionrules) 
    {
        this.decisionrules = decisionrules;
    }

    public String getDecisionrules() 
    {
        return decisionrules;
    }

    public void setOrinodisplayflag(Long orinodisplayflag) 
    {
        this.orinodisplayflag = orinodisplayflag;
    }

    public Long getOrinodisplayflag() 
    {
        return orinodisplayflag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("analytesid", getAnalytesid())
            .append("testsid", getTestsid())
            .append("sorter", getSorter())
            .append("analyte", getAnalyte())
            .append("sinonym", getSinonym())
            .append("picture", getPicture())
            .append("units", getUnits())
            .append("repnum", getRepnum())
            .append("analyteype", getAnalyteype())
            .append("displayflag", getDisplayflag())
            .append("scientflag", getScientflag())
            .append("low", getLow())
            .append("high", getHigh())
            .append("version", getVersion())
            .append("isweight", getIsweight())
            .append("calcname", getCalcname())
            .append("testcode", getTestcode())
            .append("lowUnit", getLowUnit())
            .append("quantificationLimit", getQuantificationLimit())
            .append("qltUnit", getQltUnit())
            .append("correctionfactor", getCorrectionfactor())
            .append("dilutionrate", getDilutionrate())
            .append("volume", getVolume())
            .append("validlimitrem", getValidlimitrem())
            .append("method", getMethod())
            .append("analtype", getAnaltype())
            .append("analyteremark", getAnalyteremark())
            .append("analyteEn", getAnalyteEn())
            .append("sinonymEn", getSinonymEn())
            .append("analytescode", getAnalytescode())
            .append("formulatext", getFormulatext())
            .append("zb", getZb())
            .append("datareference", getDatareference())
            .append("scientific", getScientific())
            .append("ltdflag", getLtdflag())
            .append("ltdflagc", getLtdflagc())
            .append("isscene", getIsscene())
            .append("notdetectedremark", getNotdetectedremark())
            .append("testremark", getTestremark())
            .append("isformula", getIsformula())
            .append("reportremark", getReportremark())
            .append("decisionrules", getDecisionrules())
            .append("orinodisplayflag", getOrinodisplayflag())
            .toString();
    }
}
