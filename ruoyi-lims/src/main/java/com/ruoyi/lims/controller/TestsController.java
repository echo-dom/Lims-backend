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
import com.ruoyi.lims.domain.Tests;
import com.ruoyi.lims.service.ITestsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 检验项目（LIMS_TESTS）Controller
 * 
 * @author kongdejin
 * @date 2025-06-17
 */
@RestController
@RequestMapping("/lims/tests")
public class TestsController extends BaseController
{
    @Autowired
    private ITestsService testsService;

    /**
     * 查询检验项目（LIMS_TESTS）列表
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:list')")
    @GetMapping("/list")
    public TableDataInfo list(Tests tests)
    {
        startPage();
        List<Tests> list = testsService.selectTestsList(tests);
        return getDataTable(list);
    }

    /**
     * 导出检验项目（LIMS_TESTS）列表
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:export')")
    @Log(title = "检验项目（LIMS_TESTS）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Tests tests)
    {
        List<Tests> list = testsService.selectTestsList(tests);
        ExcelUtil<Tests> util = new ExcelUtil<Tests>(Tests.class);
        util.exportExcel(response, list, "检验项目（LIMS_TESTS）数据");
    }

    /**
     * 获取检验项目（LIMS_TESTS）详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:query')")
    @GetMapping(value = "/{TESTSID}")
    public AjaxResult getInfo(@PathVariable("TESTSID") String TESTSID)
    {
        return success(testsService.selectTestsByTESTSID(TESTSID));
    }

    /**
     * 新增检验项目（LIMS_TESTS）
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:add')")
    @Log(title = "检验项目（LIMS_TESTS）", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Tests tests)
    {
        return toAjax(testsService.insertTests(tests));
    }

    /**
     * 修改检验项目（LIMS_TESTS）
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:edit')")
    @Log(title = "检验项目（LIMS_TESTS）", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Tests tests)
    {
        return toAjax(testsService.updateTests(tests));
    }

    /**
     * 删除检验项目（LIMS_TESTS）
     */
    @PreAuthorize("@ss.hasPermi('lims:tests:remove')")
    @Log(title = "检验项目（LIMS_TESTS）", businessType = BusinessType.DELETE)
	@DeleteMapping("/{TESTSIDs}")
    public AjaxResult remove(@PathVariable String[] TESTSIDs)
    {
        return toAjax(testsService.deleteTestsByTESTSIDs(TESTSIDs));
    }
}
