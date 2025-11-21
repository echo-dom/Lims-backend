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
import com.ruoyi.lims.domain.Sample;
import com.ruoyi.lims.service.ISampleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * LIMS样品Controller
 * 
 * @author kongdejin
 * @date 2025-06-05
 */
@RestController
@RequestMapping("/lims/sample")
public class SampleController extends BaseController
{
    @Autowired
    private ISampleService sampleService;

    /**
     * 查询LIMS样品列表
     */
    @PreAuthorize("@ss.hasPermi('lims:sample:list')")
    @GetMapping("/list")
    public TableDataInfo list(Sample sample)
    {
        startPage();
        List<Sample> list = sampleService.selectSampleList(sample);
        return getDataTable(list);
    }

    /**
     * 导出LIMS样品列表
     */
    @PreAuthorize("@ss.hasPermi('lims:sample:export')")
    @Log(title = "LIMS样品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Sample sample)
    {
        List<Sample> list = sampleService.selectSampleList(sample);
        ExcelUtil<Sample> util = new ExcelUtil<Sample>(Sample.class);
        util.exportExcel(response, list, "LIMS样品数据");
    }

    /**
     * 获取LIMS样品详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:sample:query')")
    @GetMapping(value = "/{sampleId}")
    public AjaxResult getInfo(@PathVariable("sampleId") Long sampleId)
    {
        return success(sampleService.selectSampleBySampleId(sampleId));
    }

    /**
     * 新增LIMS样品
     */
    @PreAuthorize("@ss.hasPermi('lims:sample:add')")
    @Log(title = "LIMS样品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Sample sample)
    {
        return toAjax(sampleService.insertSample(sample));
    }

    /**
     * 修改LIMS样品
     */
    @PreAuthorize("@ss.hasPermi('lims:sample:edit')")
    @Log(title = "LIMS样品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Sample sample)
    {
        return toAjax(sampleService.updateSample(sample));
    }

    /**
     * 删除LIMS样品
     */
    @PreAuthorize("@ss.hasPermi('lims:sample:remove')")
    @Log(title = "LIMS样品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sampleIds}")
    public AjaxResult remove(@PathVariable Long[] sampleIds)
    {
        return toAjax(sampleService.deleteSampleBySampleIds(sampleIds));
    }
}
