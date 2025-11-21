package com.ruoyi.lims.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.lims.domain.SampleCodeRule;
import com.ruoyi.lims.service.ISampleCodeRuleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 样品编码规则Controller
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
@RestController
@RequestMapping("/lims/rule")
public class SampleCodeRuleController extends BaseController
{
    @Autowired
    private ISampleCodeRuleService sampleCodeRuleService;

    /**
     * 查询样品编码规则列表
     */
    @PreAuthorize("@ss.hasPermi('lims:rule:list')")
    @GetMapping("/list")
    public TableDataInfo list(SampleCodeRule sampleCodeRule)
    {
        startPage();
        List<SampleCodeRule> list = sampleCodeRuleService.selectSampleCodeRuleList(sampleCodeRule);
        return getDataTable(list);
    }

    /**
     * 导出样品编码规则列表
     */
    @PreAuthorize("@ss.hasPermi('lims:rule:export')")
    @Log(title = "样品编码规则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SampleCodeRule sampleCodeRule)
    {
        List<SampleCodeRule> list = sampleCodeRuleService.selectSampleCodeRuleList(sampleCodeRule);
        ExcelUtil<SampleCodeRule> util = new ExcelUtil<SampleCodeRule>(SampleCodeRule.class);
        util.exportExcel(response, list, "样品编码规则数据");
    }

    /**
     * 获取样品编码规则详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:rule:query')")
    @GetMapping(value = "/{ruleId}")
    public AjaxResult getInfo(@PathVariable("ruleId") Long ruleId)
    {
        return success(sampleCodeRuleService.selectSampleCodeRuleByRuleId(ruleId));
    }

    /**
     * 新增样品编码规则
     */
    @PreAuthorize("@ss.hasPermi('lims:rule:add')")
    @Log(title = "样品编码规则", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SampleCodeRule sampleCodeRule)
    {
        return toAjax(sampleCodeRuleService.insertSampleCodeRule(sampleCodeRule));
    }

    /**
     * 修改样品编码规则
     */
    @PreAuthorize("@ss.hasPermi('lims:rule:edit')")
    @Log(title = "样品编码规则", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SampleCodeRule sampleCodeRule)
    {
        return toAjax(sampleCodeRuleService.updateSampleCodeRule(sampleCodeRule));
    }

    /**
     * 删除样品编码规则
     */
    @PreAuthorize("@ss.hasPermi('lims:rule:remove')")
    @Log(title = "样品编码规则", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ruleIds}")
    public AjaxResult remove(@PathVariable Long[] ruleIds)
    {
        return toAjax(sampleCodeRuleService.deleteSampleCodeRuleByRuleIds(ruleIds));
    }
}
