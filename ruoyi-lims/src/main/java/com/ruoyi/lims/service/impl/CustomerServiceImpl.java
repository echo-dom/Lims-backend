package com.ruoyi.lims.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.lims.mapper.CustomerMapper;
import com.ruoyi.lims.domain.Customer;
import com.ruoyi.lims.service.ICustomerService;

/**
 * LIMS客户Service业务层处理
 * 
 * @author kongdejin
 * @date 2025-06-24
 */
@Service
public class CustomerServiceImpl implements ICustomerService 
{
    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询LIMS客户
     * 
     * @param customerId LIMS客户主键
     * @return LIMS客户
     */
    @Override
    public Customer selectCustomerByCustomerId(Long customerId)
    {
        return customerMapper.selectCustomerByCustomerId(customerId);
    }

    /**
     * 查询LIMS客户列表
     * 
     * @param customer LIMS客户
     * @return LIMS客户
     */
    @Override
    public List<Customer> selectCustomerList(Customer customer)
    {
        return customerMapper.selectCustomerList(customer);
    }

    /**
     * 新增LIMS客户
     * 
     * @param customer LIMS客户
     * @return 结果
     */
    @Override
    public int insertCustomer(Customer customer)
    {
        return customerMapper.insertCustomer(customer);
    }

    /**
     * 修改LIMS客户
     * 
     * @param customer LIMS客户
     * @return 结果
     */
    @Override
    public int updateCustomer(Customer customer)
    {
        return customerMapper.updateCustomer(customer);
    }

    /**
     * 批量删除LIMS客户
     * 
     * @param customerIds 需要删除的LIMS客户主键
     * @return 结果
     */
    @Override
    public int deleteCustomerByCustomerIds(Long[] customerIds)
    {
        return customerMapper.deleteCustomerByCustomerIds(customerIds);
    }

    /**
     * 删除LIMS客户信息
     * 
     * @param customerId LIMS客户主键
     * @return 结果
     */
    @Override
    public int deleteCustomerByCustomerId(Long customerId)
    {
        return customerMapper.deleteCustomerByCustomerId(customerId);
    }
}
