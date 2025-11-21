package com.ruoyi.lims.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.ContractmanagementMapper;
import com.ruoyi.lims.domain.Contractmanagement;
import com.ruoyi.lims.service.IContractmanagementService;

/**
 * 合同管理Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-06-27
 */
@Service
public class ContractmanagementServiceImpl implements IContractmanagementService 
{
    @Autowired
    private ContractmanagementMapper contractmanagementMapper;

    /**
     * 查询合同管理
     * 
     * @param contractid 合同管理主键
     * @return 合同管理
     */
    @Override
    public Contractmanagement selectContractmanagementByContractid(String contractid)
    {
        return contractmanagementMapper.selectContractmanagementByContractid(contractid);
    }

    /**
     * 查询合同管理列表
     * 
     * @param contractmanagement 合同管理
     * @return 合同管理
     */
    @Override
    public List<Contractmanagement> selectContractmanagementList(Contractmanagement contractmanagement)
    {
        return contractmanagementMapper.selectContractmanagementList(contractmanagement);
    }

    /**
     * 新增合同管理
     * 
     * @param contractmanagement 合同管理
     * @return 结果
     */
    @Override
    public int insertContractmanagement(Contractmanagement contractmanagement)
    {
        return contractmanagementMapper.insertContractmanagement(contractmanagement);
    }

    /**
     * 修改合同管理
     * 
     * @param contractmanagement 合同管理
     * @return 结果
     */
    @Override
    public int updateContractmanagement(Contractmanagement contractmanagement)
    {
        return contractmanagementMapper.updateContractmanagement(contractmanagement);
    }

    /**
     * 批量删除合同管理
     * 
     * @param contractids 需要删除的合同管理主键
     * @return 结果
     */
    @Override
    public int deleteContractmanagementByContractids(String[] contractids)
    {
        return contractmanagementMapper.deleteContractmanagementByContractids(contractids);
    }

    /**
     * 删除合同管理信息
     * 
     * @param contractid 合同管理主键
     * @return 结果
     */
    @Override
    public int deleteContractmanagementByContractid(String contractid)
    {
        return contractmanagementMapper.deleteContractmanagementByContractid(contractid);
    }
}
