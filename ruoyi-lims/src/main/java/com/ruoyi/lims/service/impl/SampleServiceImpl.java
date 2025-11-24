package com.ruoyi.lims.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.SampleMapper;
import com.ruoyi.lims.domain.Sample;
import com.ruoyi.lims.service.ISampleService;

/**
 * LIMS样品Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-06-05
 */
@Service
public class SampleServiceImpl implements ISampleService {
    @Autowired
    private SampleMapper sampleMapper;

    @Autowired
    private com.ruoyi.lims.service.SampleCodeGenerator sampleCodeGenerator;

    /**
     * 查询LIMS样品
     * 
     * @param sampleId LIMS样品主键
     * @return LIMS样品
     */
    @Override
    public Sample selectSampleBySampleId(Long sampleId) {
        return sampleMapper.selectSampleBySampleId(sampleId);
    }

    /**
     * 查询LIMS样品列表
     * 
     * @param sample LIMS样品
     * @return LIMS样品
     */
    @Override
    public List<Sample> selectSampleList(Sample sample) {
        return sampleMapper.selectSampleList(sample);
    }

    /**
     * 新增LIMS样品
     * 
     * @param sample LIMS样品
     * @return 结果
     */
    @Override
    public int insertSample(Sample sample) {
        sample.setCreateTime(DateUtils.getNowDate());

        // Try to extract addressCode from remark if present (frontend sends it there)
        if (com.ruoyi.common.utils.StringUtils.isNotEmpty(sample.getRemark())) {
            try {
                com.alibaba.fastjson2.JSONObject json = com.alibaba.fastjson2.JSON.parseObject(sample.getRemark());
                if (json.containsKey("ccode")) {
                    sample.setAddressCode(json.getString("ccode"));
                }
            } catch (Exception e) {
                // Ignore parsing errors, remark might not be JSON
            }
        }

        // Generate sample code if not provided
        if (com.ruoyi.common.utils.StringUtils.isEmpty(sample.getSampleCode())) {
            try {
                String code = sampleCodeGenerator.generateCode(sample);
                sample.setSampleCode(code);
            } catch (Exception e) {
                // Log error or rethrow?
                // For now, let it bubble up or handle gracefully if rule not found.
                // If rule not found, maybe we shouldn't block insertion if code is optional?
                // But user asked for automatic generation. If it fails, it should probably fail
                // the request.
                throw e;
            }
        }
        return sampleMapper.insertSample(sample);
    }

    /**
     * 修改LIMS样品
     * 
     * @param sample LIMS样品
     * @return 结果
     */
    @Override
    public int updateSample(Sample sample) {
        sample.setUpdateTime(DateUtils.getNowDate());
        return sampleMapper.updateSample(sample);
    }

    /**
     * 批量删除LIMS样品
     * 
     * @param sampleIds 需要删除的LIMS样品主键
     * @return 结果
     */
    @Override
    public int deleteSampleBySampleIds(Long[] sampleIds) {
        return sampleMapper.deleteSampleBySampleIds(sampleIds);
    }

    /**
     * 删除LIMS样品信息
     * 
     * @param sampleId LIMS样品主键
     * @return 结果
     */
    @Override
    public int deleteSampleBySampleId(Long sampleId) {
        return sampleMapper.deleteSampleBySampleId(sampleId);
    }
}
