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
import com.ruoyi.lims.domain.SpTests;
import com.ruoyi.lims.service.ISpTestsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 方案项目Controller
 * 
 * @author kongdejin
 * @date 2025-11-24
 */
@RestController
@RequestMapping("/lims/tests")
public class SpTestsController extends BaseController
{
    @Autowired
    private ISpTestsService spTestsService;

    /**
     * 查询方案项目列表
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:list')")
    @GetMapping("/list")
    public TableDataInfo list(SpTests spTests)
    {
        startPage();
        List<SpTests> list = spTestsService.selectSpTestsList(spTests);
        return getDataTable(list);
    }

    /**
     * 导出方案项目列表
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:export')")
    @Log(title = "方案项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SpTests spTests)
    {
        List<SpTests> list = spTestsService.selectSpTestsList(spTests);
        ExcelUtil<SpTests> util = new ExcelUtil<SpTests>(SpTests.class);
        util.exportExcel(response, list, "方案项目数据");
    }

    /**
     * 获取方案项目详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:query')")
    @GetMapping(value = "/{spTestsId}")
    public AjaxResult getInfo(@PathVariable("spTestsId") Long spTestsId)
    {
        return success(spTestsService.selectSpTestsBySpTestsId(spTestsId));
    }

    /**
     * 新增方案项目
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:add')")
    @Log(title = "方案项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SpTests spTests)
    {
        return toAjax(spTestsService.insertSpTests(spTests));
    }

    /**
     * 修改方案项目
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:edit')")
    @Log(title = "方案项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SpTests spTests)
    {
        return toAjax(spTestsService.updateSpTests(spTests));
    }

    /**
     * 删除方案项目
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:remove')")
    @Log(title = "方案项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{spTestsIds}")
    public AjaxResult remove(@PathVariable Long[] spTestsIds)
    {
        return toAjax(spTestsService.deleteSpTestsBySpTestsIds(spTestsIds));
    }
}
