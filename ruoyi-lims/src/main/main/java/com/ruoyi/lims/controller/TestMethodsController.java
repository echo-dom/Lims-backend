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
import com.ruoyi.lims.domain.TestMethods;
import com.ruoyi.lims.service.ITestMethodsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试方法Controller
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
@RestController
@RequestMapping("/lims/methods")
public class TestMethodsController extends BaseController
{
    @Autowired
    private ITestMethodsService testMethodsService;

    /**
     * 查询测试方法列表
     */
    @PreAuthorize("@ss.hasPermi('lims:methods:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestMethods testMethods)
    {
        startPage();
        List<TestMethods> list = testMethodsService.selectTestMethodsList(testMethods);
        return getDataTable(list);
    }

    /**
     * 导出测试方法列表
     */
    @PreAuthorize("@ss.hasPermi('lims:methods:export')")
    @Log(title = "测试方法", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestMethods testMethods)
    {
        List<TestMethods> list = testMethodsService.selectTestMethodsList(testMethods);
        ExcelUtil<TestMethods> util = new ExcelUtil<TestMethods>(TestMethods.class);
        util.exportExcel(response, list, "测试方法数据");
    }

    /**
     * 获取测试方法详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:methods:query')")
    @GetMapping(value = "/{testMethodsId}")
    public AjaxResult getInfo(@PathVariable("testMethodsId") Long testMethodsId)
    {
        return success(testMethodsService.selectTestMethodsByTestMethodsId(testMethodsId));
    }

    /**
     * 新增测试方法
     */
    @PreAuthorize("@ss.hasPermi('lims:methods:add')")
    @Log(title = "测试方法", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestMethods testMethods)
    {
        return toAjax(testMethodsService.insertTestMethods(testMethods));
    }

    /**
     * 修改测试方法
     */
    @PreAuthorize("@ss.hasPermi('lims:methods:edit')")
    @Log(title = "测试方法", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestMethods testMethods)
    {
        return toAjax(testMethodsService.updateTestMethods(testMethods));
    }

    /**
     * 删除测试方法
     */
    @PreAuthorize("@ss.hasPermi('lims:methods:remove')")
    @Log(title = "测试方法", businessType = BusinessType.DELETE)
	@DeleteMapping("/{testMethodsIds}")
    public AjaxResult remove(@PathVariable Long[] testMethodsIds)
    {
        return toAjax(testMethodsService.deleteTestMethodsByTestMethodsIds(testMethodsIds));
    }
}
