package com.ruoyi.lims.mapper;

import java.util.List;
import com.ruoyi.lims.domain.Contractmanagement;

/**
 * 合同管理Mapper接口
 * 
 * @author kongdejin
 * @date 2025-06-27
 */
public interface ContractmanagementMapper 
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
     * 删除合同管理
     * 
     * @param contractid 合同管理主键
     * @return 结果
     */
    public int deleteContractmanagementByContractid(String contractid);

    /**
     * 批量删除合同管理
     * 
     * @param contractids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteContractmanagementByContractids(String[] contractids);
}
