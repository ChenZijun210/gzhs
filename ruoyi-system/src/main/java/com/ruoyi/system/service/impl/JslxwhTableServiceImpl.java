package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JslxwhTableMapper;
import com.ruoyi.system.domain.JslxwhTable;
import com.ruoyi.system.service.IJslxwhTableService;

/**
 * 计时类型维护Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class JslxwhTableServiceImpl implements IJslxwhTableService 
{
    @Autowired
    private JslxwhTableMapper jslxwhTableMapper;

    /**
     * 查询计时类型维护
     * 
     * @param jslxId 计时类型维护主键
     * @return 计时类型维护
     */
    @Override
    public JslxwhTable selectJslxwhTableByJslxId(Long jslxId)
    {
        return jslxwhTableMapper.selectJslxwhTableByJslxId(jslxId);
    }

    /**
     * 查询计时类型维护列表
     * 
     * @param jslxwhTable 计时类型维护
     * @return 计时类型维护
     */
    @Override
    public List<JslxwhTable> selectJslxwhTableList(JslxwhTable jslxwhTable)
    {
        return jslxwhTableMapper.selectJslxwhTableList(jslxwhTable);
    }

    /**
     * 新增计时类型维护
     * 
     * @param jslxwhTable 计时类型维护
     * @return 结果
     */
    @Override
    public int insertJslxwhTable(JslxwhTable jslxwhTable)
    {
        jslxwhTable.setCreateTime(DateUtils.getNowDate());
        return jslxwhTableMapper.insertJslxwhTable(jslxwhTable);
    }

    /**
     * 修改计时类型维护
     * 
     * @param jslxwhTable 计时类型维护
     * @return 结果
     */
    @Override
    public int updateJslxwhTable(JslxwhTable jslxwhTable)
    {
        jslxwhTable.setUpdateTime(DateUtils.getNowDate());
        return jslxwhTableMapper.updateJslxwhTable(jslxwhTable);
    }

    /**
     * 批量删除计时类型维护
     * 
     * @param jslxIds 需要删除的计时类型维护主键
     * @return 结果
     */
    @Override
    public int deleteJslxwhTableByJslxIds(Long[] jslxIds)
    {
        return jslxwhTableMapper.deleteJslxwhTableByJslxIds(jslxIds);
    }

    /**
     * 删除计时类型维护信息
     * 
     * @param jslxId 计时类型维护主键
     * @return 结果
     */
    @Override
    public int deleteJslxwhTableByJslxId(Long jslxId)
    {
        return jslxwhTableMapper.deleteJslxwhTableByJslxId(jslxId);
    }
}
