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
import com.ruoyi.lims.domain.Contractmanagement;
import com.ruoyi.lims.service.IContractmanagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 合同管理Controller
 * 
 * @author kongdejin
 * @date 2025-06-27
 */
@RestController
@RequestMapping("/lims/contractmanagement")
public class ContractmanagementController extends BaseController
{
    @Autowired
    private IContractmanagementService contractmanagementService;

    /**
     * 查询合同管理列表
     */
    @PreAuthorize("@ss.hasPermi('lims:contractmanagement:list')")
    @GetMapping("/list")
    public TableDataInfo list(Contractmanagement contractmanagement)
    {
        startPage();
        List<Contractmanagement> list = contractmanagementService.selectContractmanagementList(contractmanagement);
        return getDataTable(list);
    }

    /**
     * 导出合同管理列表
     */
    @PreAuthorize("@ss.hasPermi('lims:contractmanagement:export')")
    @Log(title = "合同管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Contractmanagement contractmanagement)
    {
        List<Contractmanagement> list = contractmanagementService.selectContractmanagementList(contractmanagement);
        ExcelUtil<Contractmanagement> util = new ExcelUtil<Contractmanagement>(Contractmanagement.class);
        util.exportExcel(response, list, "合同管理数据");
    }

    /**
     * 获取合同管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:contractmanagement:query')")
    @GetMapping(value = "/{contractid}")
    public AjaxResult getInfo(@PathVariable("contractid") String contractid)
    {
        return success(contractmanagementService.selectContractmanagementByContractid(contractid));
    }

    /**
     * 新增合同管理
     */
    @PreAuthorize("@ss.hasPermi('lims:contractmanagement:add')")
    @Log(title = "合同管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Contractmanagement contractmanagement)
    {
        return toAjax(contractmanagementService.insertContractmanagement(contractmanagement));
    }

    /**
     * 修改合同管理
     */
    @PreAuthorize("@ss.hasPermi('lims:contractmanagement:edit')")
    @Log(title = "合同管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Contractmanagement contractmanagement)
    {
        return toAjax(contractmanagementService.updateContractmanagement(contractmanagement));
    }

    /**
     * 删除合同管理
     */
    @PreAuthorize("@ss.hasPermi('lims:contractmanagement:remove')")
    @Log(title = "合同管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{contractids}")
    public AjaxResult remove(@PathVariable String[] contractids)
    {
        return toAjax(contractmanagementService.deleteContractmanagementByContractids(contractids));
    }
}
