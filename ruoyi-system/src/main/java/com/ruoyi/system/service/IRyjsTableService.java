package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.RyjsTable;

/**
 * 人员记时Service接口
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
public interface IRyjsTableService 
{
    /**
     * 查询人员记时
     * 
     * @param ryjsId 人员记时主键
     * @return 人员记时
     */
    public RyjsTable selectRyjsTableByRyjsId(Long ryjsId);

    /**
     * 查询人员记时列表
     * 
     * @param ryjsTable 人员记时
     * @return 人员记时集合
     */
    public List<RyjsTable> selectRyjsTableList(RyjsTable ryjsTable);


    List<RyjsTable> selectRyjsTableByYearMonth(String date);

    /**
     * 新增人员记时
     * 
     * @param ryjsTable 人员记时
     * @return 结果
     */
    public int insertRyjsTable(RyjsTable ryjsTable);

    /**
     * 修改人员记时
     * 
     * @param ryjsTable 人员记时
     * @return 结果
     */
    public int updateRyjsTable(RyjsTable ryjsTable);

    /**
     * 批量删除人员记时
     * 
     * @param ryjsIds 需要删除的人员记时主键集合
     * @return 结果
     */
    public int deleteRyjsTableByRyjsIds(Long[] ryjsIds);

    /**
     * 删除人员记时信息
     * 
     * @param ryjsId 人员记时主键
     * @return 结果
     */
    public int deleteRyjsTableByRyjsId(Long ryjsId);
}
