package com.ruoyi.lims.service;

import java.util.List;
import com.ruoyi.lims.domain.Project;

/**
 * 方案Service接口
 * 
 * @author kongdejin
 * @date 2025-11-20
 */
public interface IProjectService 
{
    /**
     * 查询方案
     * 
     * @param projectId 方案主键
     * @return 方案
     */
    public Project selectProjectByProjectId(Long projectId);

    /**
     * 查询方案列表
     * 
     * @param project 方案
     * @return 方案集合
     */
    public List<Project> selectProjectList(Project project);

    /**
     * 新增方案
     * 
     * @param project 方案
     * @return 结果
     */
    public int insertProject(Project project);

    /**
     * 修改方案
     * 
     * @param project 方案
     * @return 结果
     */
    public int updateProject(Project project);

    /**
     * 批量删除方案
     * 
     * @param projectIds 需要删除的方案主键集合
     * @return 结果
     */
    public int deleteProjectByProjectIds(Long[] projectIds);

    /**
     * 删除方案信息
     * 
     * @param projectId 方案主键
     * @return 结果
     */
    public int deleteProjectByProjectId(Long projectId);
}
