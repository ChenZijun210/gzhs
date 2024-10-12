package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.JjgsgzTable;

/**
 * 工资Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
public interface JjgsgzTableMapper 
{
    /**
     * 查询工资
     * 
     * @param jjgsgzId 工资主键
     * @return 工资
     */
    public JjgsgzTable selectJjgsgzTableByJjgsgzId(Long jjgsgzId);

    /**
     * 查询工资列表
     * 
     * @param jjgsgzTable 工资
     * @return 工资集合
     */
    public List<JjgsgzTable> selectJjgsgzTableList(JjgsgzTable jjgsgzTable);

    /**
     * 新增工资
     * 
     * @param jjgsgzTable 工资
     * @return 结果
     */
    public int insertJjgsgzTable(JjgsgzTable jjgsgzTable);

    /**
     * 修改工资
     * 
     * @param jjgsgzTable 工资
     * @return 结果
     */
    public int updateJjgsgzTable(JjgsgzTable jjgsgzTable);

    /**
     * 删除工资
     * 
     * @param jjgsgzId 工资主键
     * @return 结果
     */
    public int deleteJjgsgzTableByJjgsgzId(Long jjgsgzId);

    /**
     * 批量删除工资
     * 
     * @param jjgsgzIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteJjgsgzTableByJjgsgzIds(Long[] jjgsgzIds);
}
