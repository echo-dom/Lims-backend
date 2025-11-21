package com.ruoyi.lims.mapper;

import java.util.List;
import com.ruoyi.lims.domain.Customer;

/**
 * LIMS客户Mapper接口
 * 
 * @author kongdejin
 * @date 2025-06-24
 */
public interface CustomerMapper 
{
    /**
     * 查询LIMS客户
     * 
     * @param customerId LIMS客户主键
     * @return LIMS客户
     */
    public Customer selectCustomerByCustomerId(Long customerId);

    /**
     * 查询LIMS客户列表
     * 
     * @param customer LIMS客户
     * @return LIMS客户集合
     */
    public List<Customer> selectCustomerList(Customer customer);

    /**
     * 新增LIMS客户
     * 
     * @param customer LIMS客户
     * @return 结果
     */
    public int insertCustomer(Customer customer);

    /**
     * 修改LIMS客户
     * 
     * @param customer LIMS客户
     * @return 结果
     */
    public int updateCustomer(Customer customer);

    /**
     * 删除LIMS客户
     * 
     * @param customerId LIMS客户主键
     * @return 结果
     */
    public int deleteCustomerByCustomerId(Long customerId);

    /**
     * 批量删除LIMS客户
     * 
     * @param customerIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomerByCustomerIds(Long[] customerIds);
}
