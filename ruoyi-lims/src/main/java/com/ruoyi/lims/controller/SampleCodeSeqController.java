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
import com.ruoyi.lims.domain.SampleCodeSeq;
import com.ruoyi.lims.service.ISampleCodeSeqService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 样品编码序列Controller
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
@RestController
@RequestMapping("/lims/seq")
public class SampleCodeSeqController extends BaseController
{
    @Autowired
    private ISampleCodeSeqService sampleCodeSeqService;

    /**
     * 查询样品编码序列列表
     */
    @PreAuthorize("@ss.hasPermi('lims:seq:list')")
    @GetMapping("/list")
    public TableDataInfo list(SampleCodeSeq sampleCodeSeq)
    {
        startPage();
        List<SampleCodeSeq> list = sampleCodeSeqService.selectSampleCodeSeqList(sampleCodeSeq);
        return getDataTable(list);
    }

    /**
     * 导出样品编码序列列表
     */
    @PreAuthorize("@ss.hasPermi('lims:seq:export')")
    @Log(title = "样品编码序列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SampleCodeSeq sampleCodeSeq)
    {
        List<SampleCodeSeq> list = sampleCodeSeqService.selectSampleCodeSeqList(sampleCodeSeq);
        ExcelUtil<SampleCodeSeq> util = new ExcelUtil<SampleCodeSeq>(SampleCodeSeq.class);
        util.exportExcel(response, list, "样品编码序列数据");
    }

    /**
     * 获取样品编码序列详细信息
     */
    @PreAuthorize("@ss.hasPermi('lims:seq:query')")
    @GetMapping(value = "/{seqId}")
    public AjaxResult getInfo(@PathVariable("seqId") Long seqId)
    {
        return success(sampleCodeSeqService.selectSampleCodeSeqBySeqId(seqId));
    }

    /**
     * 新增样品编码序列
     */
    @PreAuthorize("@ss.hasPermi('lims:seq:add')")
    @Log(title = "样品编码序列", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SampleCodeSeq sampleCodeSeq)
    {
        return toAjax(sampleCodeSeqService.insertSampleCodeSeq(sampleCodeSeq));
    }

    /**
     * 修改样品编码序列
     */
    @PreAuthorize("@ss.hasPermi('lims:seq:edit')")
    @Log(title = "样品编码序列", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SampleCodeSeq sampleCodeSeq)
    {
        return toAjax(sampleCodeSeqService.updateSampleCodeSeq(sampleCodeSeq));
    }

    /**
     * 删除样品编码序列
     */
    @PreAuthorize("@ss.hasPermi('lims:seq:remove')")
    @Log(title = "样品编码序列", businessType = BusinessType.DELETE)
	@DeleteMapping("/{seqIds}")
    public AjaxResult remove(@PathVariable Long[] seqIds)
    {
        return toAjax(sampleCodeSeqService.deleteSampleCodeSeqBySeqIds(seqIds));
    }
}
