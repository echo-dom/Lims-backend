package com.ruoyi.lims.service;

import java.util.List;
import com.ruoyi.lims.domain.Contractmanagement;

/**
 * 合同管理Service接口
 * 
 * @author kongdejin
 * @date 2025-06-27
 */
public interface IContractmanagementService 
{
    /**
     * 查询合同管理
     * 
     * @param contractid 合同管理主键
     * @return 合同管理
     */
    public Contractmanagement selectContractmanagementByContractid(String contractid);

    /**
     * 查询合同管理列表
     * 
     * @param contractmanagement 合同管理
     * @return 合同管理集合
     */
    public List<Contractmanagement> selectContractmanagementList(Contractmanagement contractmanagement);

    /**
     * 新增合同管理
     * 
     * @param contractmanagement 合同管理
     * @return 结果
     */
    public int insertContractmanagement(Contractmanagement contractmanagement);

    /**
     * 修改合同管理
     * 
     * @param contractmanagement 合同管理
     * @return 结果
     */
    public int updateContractmanagement(Contractmanagement contractmanagement);

    /**
     * 批量删除合同管理
     * 
     * @param contractids 需要删除的合同管理主键集合
     * @return 结果
     */
    public int deleteContractmanagementByContractids(String[] contractids);

    /**
     * 删除合同管理信息
     * 
     * @param contractid 合同管理主键
     * @return 结果
     */
    public int deleteContractmanagementByContractid(String contractid);
}
