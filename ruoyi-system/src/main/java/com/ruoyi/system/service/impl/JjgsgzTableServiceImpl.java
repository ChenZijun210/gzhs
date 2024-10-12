package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JjgsgzTableMapper;
import com.ruoyi.system.domain.JjgsgzTable;
import com.ruoyi.system.service.IJjgsgzTableService;

/**
 * 工资Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class JjgsgzTableServiceImpl implements IJjgsgzTableService 
{
    @Autowired
    private JjgsgzTableMapper jjgsgzTableMapper;

    /**
     * 查询工资
     * 
     * @param jjgsgzId 工资主键
     * @return 工资
     */
    @Override
    public JjgsgzTable selectJjgsgzTableByJjgsgzId(Long jjgsgzId)
    {
        return jjgsgzTableMapper.selectJjgsgzTableByJjgsgzId(jjgsgzId);
    }

    /**
     * 查询工资列表
     * 
     * @param jjgsgzTable 工资
     * @return 工资
     */
    @Override
    public List<JjgsgzTable> selectJjgsgzTableList(JjgsgzTable jjgsgzTable)
    {
        return jjgsgzTableMapper.selectJjgsgzTableList(jjgsgzTable);
    }

    /**
     * 新增工资
     * 
     * @param jjgsgzTable 工资
     * @return 结果
     */
    @Override
    public int insertJjgsgzTable(JjgsgzTable jjgsgzTable)
    {
        jjgsgzTable.setCreateTime(DateUtils.getNowDate());
        return jjgsgzTableMapper.insertJjgsgzTable(jjgsgzTable);
    }

    /**
     * 修改工资
     * 
     * @param jjgsgzTable 工资
     * @return 结果
     */
    @Override
    public int updateJjgsgzTable(JjgsgzTable jjgsgzTable)
    {
        jjgsgzTable.setUpdateTime(DateUtils.getNowDate());
        return jjgsgzTableMapper.updateJjgsgzTable(jjgsgzTable);
    }

    /**
     * 批量删除工资
     * 
     * @param jjgsgzIds 需要删除的工资主键
     * @return 结果
     */
    @Override
    public int deleteJjgsgzTableByJjgsgzIds(Long[] jjgsgzIds)
    {
        return jjgsgzTableMapper.deleteJjgsgzTableByJjgsgzIds(jjgsgzIds);
    }

    /**
     * 删除工资信息
     * 
     * @param jjgsgzId 工资主键
     * @return 结果
     */
    @Override
    public int deleteJjgsgzTableByJjgsgzId(Long jjgsgzId)
    {
        return jjgsgzTableMapper.deleteJjgsgzTableByJjgsgzId(jjgsgzId);
    }
}
