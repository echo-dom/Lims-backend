package com.ruoyi.lims.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 检验项目（LIMS_TESTS）对象 lims_tests
 * 
 * @author kongdejin
 * @date 2025-06-17
 */
public class Tests extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private String TESTSID;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long SORTER;

    /** 检验项目代码 */
    @Excel(name = "检验项目代码")
    private String TESTCODE;

    /** 检验项目名称 */
    @Excel(name = "检验项目名称")
    private String TESTNAME;

    /** 检验项目说明 */
    @Excel(name = "检验项目说明")
    private String TESTEXPLAIN;

    /** 英文缩写 */
    @Excel(name = "英文缩写")
    private String SPELLSIMPLIFY;

    /** 领域 */
    @Excel(name = "领域")
    private String FULLTYPE;

    /** 领域代码 */
    @Excel(name = "领域代码")
    private String DOMAINID;

    /** 项目类型ID */
    @Excel(name = "项目类型ID")
    private String TESTCATEGORYID;

    /** 项目类型名称 */
    @Excel(name = "项目类型名称")
    private String TESTCATENAME;

    /** 微生物标识 (0/1) */
    @Excel(name = "微生物标识 (0/1)")
    private Integer wswflag;

    /** 报告中显示名称 */
    @Excel(name = "报告中显示名称")
    private String NAMEINREPORT;

    /** 原始记录编码 */
    @Excel(name = "原始记录编码")
    private String ORIGINALCODE;

    /** 制样方法 */
    @Excel(name = "制样方法")
    private String samplingMethod;

    /** 历史检验人 */
    @Excel(name = "历史检验人")
    private String HISTORYPERSON;

    /** 科室 */
    @Excel(name = "科室")
    private String DEPT;

    /** 状态 */
    @Excel(name = "状态")
    private String STATUS;

    /** 备注或其他 */
    @Excel(name = "备注或其他")
    private String RECORDERCODE;

    public void setTESTSID(String TESTSID)
    {
        this.TESTSID = TESTSID;
    }

    public String getTESTSID()
    {
        return TESTSID;
    }

    public void setSORTER(Long SORTER) 
    {
        this.SORTER = SORTER;
    }

    public Long getSORTER() 
    {
        return SORTER;
    }

    public void setTESTCODE(String TESTCODE) 
    {
        this.TESTCODE = TESTCODE;
    }

    public String getTESTCODE() 
    {
        return TESTCODE;
    }

    public void setTESTNAME(String TESTNAME) 
    {
        this.TESTNAME = TESTNAME;
    }

    public String getTESTNAME() 
    {
        return TESTNAME;
    }

    public void setTESTEXPLAIN(String TESTEXPLAIN) 
    {
        this.TESTEXPLAIN = TESTEXPLAIN;
    }

    public String getTESTEXPLAIN() 
    {
        return TESTEXPLAIN;
    }

    public void setSPELLSIMPLIFY(String SPELLSIMPLIFY) 
    {
        this.SPELLSIMPLIFY = SPELLSIMPLIFY;
    }

    public String getSPELLSIMPLIFY() 
    {
        return SPELLSIMPLIFY;
    }

    public void setFULLTYPE(String FULLTYPE) 
    {
        this.FULLTYPE = FULLTYPE;
    }

    public String getFULLTYPE() 
    {
        return FULLTYPE;
    }

    public void setDOMAINID(String DOMAINID) 
    {
        this.DOMAINID = DOMAINID;
    }

    public String getDOMAINID() 
    {
        return DOMAINID;
    }

    public void setTESTCATEGORYID(String TESTCATEGORYID) 
    {
        this.TESTCATEGORYID = TESTCATEGORYID;
    }

    public String getTESTCATEGORYID() 
    {
        return TESTCATEGORYID;
    }

    public void setTESTCATENAME(String TESTCATENAME) 
    {
        this.TESTCATENAME = TESTCATENAME;
    }

    public String getTESTCATENAME() 
    {
        return TESTCATENAME;
    }

    public void setWswflag(Integer wswflag) 
    {
        this.wswflag = wswflag;
    }

    public Integer getWswflag() 
    {
        return wswflag;
    }

    public void setNAMEINREPORT(String NAMEINREPORT) 
    {
        this.NAMEINREPORT = NAMEINREPORT;
    }

    public String getNAMEINREPORT() 
    {
        return NAMEINREPORT;
    }

    public void setORIGINALCODE(String ORIGINALCODE) 
    {
        this.ORIGINALCODE = ORIGINALCODE;
    }

    public String getORIGINALCODE() 
    {
        return ORIGINALCODE;
    }

    public void setSamplingMethod(String samplingMethod) 
    {
        this.samplingMethod = samplingMethod;
    }

    public String getSamplingMethod() 
    {
        return samplingMethod;
    }

    public void setHISTORYPERSON(String HISTORYPERSON) 
    {
        this.HISTORYPERSON = HISTORYPERSON;
    }

    public String getHISTORYPERSON() 
    {
        return HISTORYPERSON;
    }

    public void setDEPT(String DEPT) 
    {
        this.DEPT = DEPT;
    }

    public String getDEPT() 
    {
        return DEPT;
    }

    public void setSTATUS(String STATUS) 
    {
        this.STATUS = STATUS;
    }

    public String getSTATUS() 
    {
        return STATUS;
    }

    public void setRECORDERCODE(String RECORDERCODE) 
    {
        this.RECORDERCODE = RECORDERCODE;
    }

    public String getRECORDERCODE() 
    {
        return RECORDERCODE;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("TESTSID", getTESTSID())
            .append("SORTER", getSORTER())
            .append("TESTCODE", getTESTCODE())
            .append("TESTNAME", getTESTNAME())
            .append("TESTEXPLAIN", getTESTEXPLAIN())
            .append("SPELLSIMPLIFY", getSPELLSIMPLIFY())
            .append("FULLTYPE", getFULLTYPE())
            .append("DOMAINID", getDOMAINID())
            .append("TESTCATEGORYID", getTESTCATEGORYID())
            .append("TESTCATENAME", getTESTCATENAME())
            .append("wswflag", getWswflag())
            .append("NAMEINREPORT", getNAMEINREPORT())
            .append("ORIGINALCODE", getORIGINALCODE())
            .append("samplingMethod", getSamplingMethod())
            .append("HISTORYPERSON", getHISTORYPERSON())
            .append("DEPT", getDEPT())
            .append("STATUS", getSTATUS())
            .append("RECORDERCODE", getRECORDERCODE())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
