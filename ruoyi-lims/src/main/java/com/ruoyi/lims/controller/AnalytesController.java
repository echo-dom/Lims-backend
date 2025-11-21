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
import com.ruoyi.lims.domain.Analytes;
import com.ruoyi.lims.service.IAnalytesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 分析项目定义Controller
 * 
 * @author kongdejin
 * @date 2025-06-17
 */
@RestController
@RequestMapping("/lims/analytes")
public class AnalytesController extends BaseController
{
    @Autowired
    private IAnalytesService analytesService;

    /**
     * 查询分析项目定义列表
     */
    @PreAuthorize("@ss.hasPermi('lims:analytes:list')")
    @GetMapping("/list")
    public TableDataInfo list(Analytes analytes)
    {
        startPage();
        List<Analytes> list = analytesService.selectAnalytesList(analytes);
        return getDataTable(list);
    }

    /**
     * 导出分析项目定义列表
     */
    @PreAuthorize("@ss.hasPermi('lims:analytes:export')")
    @Log(title = "分析项目定义", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Analytes analytes)
    {
        List<Analytes> list = analytesService.selectAnalytesList(analytes);
        ExcelUtil<Analytes> util = new ExcelUtil<Analytes>(Analytes.class);
        util.exportExcel(response, list, "分析项目定义数据");
    }

    /**
     * 获取分析项目定义详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:analytes:query')")
    @GetMapping(value = "/{analytesid}")
    public AjaxResult getInfo(@PathVariable("analytesid") String analytesid)
    {
        return success(analytesService.selectAnalytesByAnalytesid(analytesid));
    }

    /**
     * 新增分析项目定义
     */
    @PreAuthorize("@ss.hasPermi('lims:analytes:add')")
    @Log(title = "分析项目定义", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Analytes analytes)
    {
        return toAjax(analytesService.insertAnalytes(analytes));
    }

    /**
     * 修改分析项目定义
     */
    @PreAuthorize("@ss.hasPermi('lims:analytes:edit')")
    @Log(title = "分析项目定义", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Analytes analytes)
    {
        return toAjax(analytesService.updateAnalytes(analytes));
    }

    /**
     * 删除分析项目定义
     */
    @PreAuthorize("@ss.hasPermi('lims:analytes:remove')")
    @Log(title = "分析项目定义", businessType = BusinessType.DELETE)
	@DeleteMapping("/{analytesids}")
    public AjaxResult remove(@PathVariable String[] analytesids)
    {
        return toAjax(analytesService.deleteAnalytesByAnalytesids(analytesids));
    }
}
