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
import com.ruoyi.lims.domain.SamplePrograms;
import com.ruoyi.lims.service.ISampleProgramsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 执行标准Controller
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
@RestController
@RequestMapping("/lims/programs")
public class SampleProgramsController extends BaseController
{
    @Autowired
    private ISampleProgramsService sampleProgramsService;

    /**
     * 查询执行标准列表
     */
    @PreAuthorize("@ss.hasPermi('lims:programs:list')")
    @GetMapping("/list")
    public TableDataInfo list(SamplePrograms samplePrograms)
    {
        startPage();
        List<SamplePrograms> list = sampleProgramsService.selectSampleProgramsList(samplePrograms);
        return getDataTable(list);
    }

    /**
     * 导出执行标准列表
     */
    @PreAuthorize("@ss.hasPermi('lims:programs:export')")
    @Log(title = "执行标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SamplePrograms samplePrograms)
    {
        List<SamplePrograms> list = sampleProgramsService.selectSampleProgramsList(samplePrograms);
        ExcelUtil<SamplePrograms> util = new ExcelUtil<SamplePrograms>(SamplePrograms.class);
        util.exportExcel(response, list, "执行标准数据");
    }

    /**
     * 获取执行标准详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:programs:query')")
    @GetMapping(value = "/{sampleProgramsId}")
    public AjaxResult getInfo(@PathVariable("sampleProgramsId") Long sampleProgramsId)
    {
        return success(sampleProgramsService.selectSampleProgramsBySampleProgramsId(sampleProgramsId));
    }

    /**
     * 新增执行标准
     */
    @PreAuthorize("@ss.hasPermi('lims:programs:add')")
    @Log(title = "执行标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SamplePrograms samplePrograms)
    {
        return toAjax(sampleProgramsService.insertSamplePrograms(samplePrograms));
    }

    /**
     * 修改执行标准
     */
    @PreAuthorize("@ss.hasPermi('lims:programs:edit')")
    @Log(title = "执行标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SamplePrograms samplePrograms)
    {
        return toAjax(sampleProgramsService.updateSamplePrograms(samplePrograms));
    }

    /**
     * 删除执行标准
     */
    @PreAuthorize("@ss.hasPermi('lims:programs:remove')")
    @Log(title = "执行标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sampleProgramsIds}")
    public AjaxResult remove(@PathVariable Long[] sampleProgramsIds)
    {
        return toAjax(sampleProgramsService.deleteSampleProgramsBySampleProgramsIds(sampleProgramsIds));
    }
}
