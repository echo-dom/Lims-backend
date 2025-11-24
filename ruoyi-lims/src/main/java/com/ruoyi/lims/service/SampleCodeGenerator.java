package com.ruoyi.lims.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.lims.domain.Sample;
import com.ruoyi.lims.domain.SampleCodeRule;

/**
 * 样品编码生成器
 */
@Service
public class SampleCodeGenerator {

    @Autowired
    private ISampleCodeRuleService sampleCodeRuleService;

    @Autowired
    private ISampleCodeSeqService sampleCodeSeqService;

    @Autowired
    private com.ruoyi.lims.mapper.CustomerMapper customerMapper;

    public String generateCode(Sample sample) {
        // 1. Find matching rule
        SampleCodeRule rule = sampleCodeRuleService.selectMatchRule(sample.getSampleTypeId(), sample.getCustomerId());
        if (rule == null) {
            throw new RuntimeException("未找到匹配的样品编码规则");
        }

        // 2. Parse pattern
        String pattern = rule.getPattern();
        Date now = new Date();

        // Replace date placeholders
        pattern = pattern.replace("{yyyy}", new SimpleDateFormat("yyyy").format(now));
        pattern = pattern.replace("{yy}", new SimpleDateFormat("yy").format(now));
        pattern = pattern.replace("{MM}", new SimpleDateFormat("MM").format(now));
        pattern = pattern.replace("{dd}", new SimpleDateFormat("dd").format(now));

        // Replace address code placeholder
        if (StringUtils.isNotEmpty(sample.getAddressCode())) {
            pattern = pattern.replace("{ADDR}", sample.getAddressCode());
        } else {
            if (pattern.contains("{ADDR}") && sample.getCustomerId() != null) {
                com.ruoyi.lims.domain.Customer customer = customerMapper
                        .selectCustomerByCustomerId(sample.getCustomerId());
                if (customer != null) {
                    pattern = pattern.replace("{ADDR}",
                            StringUtils.isNotEmpty(customer.getCcode()) ? customer.getCcode() : "");
                } else {
                    pattern = pattern.replace("{ADDR}", "");
                }
            }
        }

        // 3. Handle sequence
        if (pattern.contains("{SEQ}")) {
            String resetType = rule.getResetType();
            String seqDate;
            if ("year".equals(resetType)) {
                seqDate = new SimpleDateFormat("yyyy").format(now);
            } else if ("month".equals(resetType)) {
                seqDate = new SimpleDateFormat("yyyyMM").format(now);
            } else if ("day".equals(resetType)) {
                seqDate = new SimpleDateFormat("yyyyMMdd").format(now);
            } else {
                seqDate = "global"; // Manual or global
            }

            long seqValue = sampleCodeSeqService.getNextSequence(rule.getRuleId(), seqDate);
            String seqStr = String.format("%0" + rule.getSeqLength() + "d", seqValue);
            pattern = pattern.replace("{SEQ}", seqStr);
        }

        // Handle prefix if not in pattern (optional, usually prefix is part of pattern
        // or prepended)
        if (StringUtils.isNotEmpty(rule.getPrefix()) && !pattern.startsWith(rule.getPrefix()))

        {
            // If prefix is separate field, prepend it. But typically pattern includes
            // everything.
            // Assuming pattern is the full template. If prefix is just a helper field, we
            // might need to use it.
            // Based on schema "prefix" exists. Let's assume it should be prepended if not
            // present.
            // Or maybe the pattern is just the dynamic part?
            // Let's assume pattern is the FULL format. If prefix is set, maybe it's for
            // filtering or legacy.
            // But let's prepend it if it's not null and not empty, just in case.
            // Actually, let's stick to pattern. The user said "pattern" is "编码模板".
        }

        return pattern;
    }
}
