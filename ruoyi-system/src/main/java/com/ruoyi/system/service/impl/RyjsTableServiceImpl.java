package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RyjsTableMapper;
import com.ruoyi.system.domain.RyjsTable;
import com.ruoyi.system.service.IRyjsTableService;

/**
 * 人员记时Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class RyjsTableServiceImpl implements IRyjsTableService 
{
    @Autowired
    private RyjsTableMapper ryjsTableMapper;

    /**
     * 查询人员记时
     * 
     * @param ryjsId 人员记时主键
     * @return 人员记时
     */
    @Override
    public RyjsTable selectRyjsTableByRyjsId(Long ryjsId)
    {
        return ryjsTableMapper.selectRyjsTableByRyjsId(ryjsId);
    }

    /**
     * 查询人员记时列表
     * 
     * @param ryjsTable 人员记时
     * @return 人员记时
     */
    @Override
    public List<RyjsTable> selectRyjsTableList(RyjsTable ryjsTable)
    {
        return ryjsTableMapper.selectRyjsTableList(ryjsTable);
    }

    /**
     * 查询人员记时同年月列表
     *
     * @param date 人员记时
     * @return 人员记时
     */
    @Override
    public List<RyjsTable> selectRyjsTableByYearMonth(String date)
    {
        return ryjsTableMapper.selectRyjsTableByYearMonth(date);
    }

    /**
     * 新增人员记时
     * 
     * @param ryjsTable 人员记时
     * @return 结果
     */
    @Override
    public int insertRyjsTable(RyjsTable ryjsTable)
    {
        ryjsTable.setCreateTime(DateUtils.getNowDate());
        return ryjsTableMapper.insertRyjsTable(ryjsTable);
    }

    /**
     * 修改人员记时
     * 
     * @param ryjsTable 人员记时
     * @return 结果
     */
    @Override
    public int updateRyjsTable(RyjsTable ryjsTable)
    {
        ryjsTable.setUpdateTime(DateUtils.getNowDate());
        return ryjsTableMapper.updateRyjsTable(ryjsTable);
    }

    /**
     * 批量删除人员记时
     * 
     * @param ryjsIds 需要删除的人员记时主键
     * @return 结果
     */
    @Override
    public int deleteRyjsTableByRyjsIds(Long[] ryjsIds)
    {
        return ryjsTableMapper.deleteRyjsTableByRyjsIds(ryjsIds);
    }

    /**
     * 删除人员记时信息
     * 
     * @param ryjsId 人员记时主键
     * @return 结果
     */
    @Override
    public int deleteRyjsTableByRyjsId(Long ryjsId)
    {
        return ryjsTableMapper.deleteRyjsTableByRyjsId(ryjsId);
    }
}
