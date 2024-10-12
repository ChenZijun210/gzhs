package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.JslxwhTable;

/**
 * 计时类型维护Service接口
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
public interface IJslxwhTableService 
{
    /**
     * 查询计时类型维护
     * 
     * @param jslxId 计时类型维护主键
     * @return 计时类型维护
     */
    public JslxwhTable selectJslxwhTableByJslxId(Long jslxId);

    /**
     * 查询计时类型维护列表
     * 
     * @param jslxwhTable 计时类型维护
     * @return 计时类型维护集合
     */
    public List<JslxwhTable> selectJslxwhTableList(JslxwhTable jslxwhTable);

    /**
     * 新增计时类型维护
     * 
     * @param jslxwhTable 计时类型维护
     * @return 结果
     */
    public int insertJslxwhTable(JslxwhTable jslxwhTable);

    /**
     * 修改计时类型维护
     * 
     * @param jslxwhTable 计时类型维护
     * @return 结果
     */
    public int updateJslxwhTable(JslxwhTable jslxwhTable);

    /**
     * 批量删除计时类型维护
     * 
     * @param jslxIds 需要删除的计时类型维护主键集合
     * @return 结果
     */
    public int deleteJslxwhTableByJslxIds(Long[] jslxIds);

    /**
     * 删除计时类型维护信息
     * 
     * @param jslxId 计时类型维护主键
     * @return 结果
     */
    public int deleteJslxwhTableByJslxId(Long jslxId);
}
