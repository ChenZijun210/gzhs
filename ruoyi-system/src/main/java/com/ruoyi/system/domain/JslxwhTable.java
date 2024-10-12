package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 计时类型维护对象 jslxwh_table
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
public class JslxwhTable extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 计时类型id */
    private Long jslxId;

    /** 计时类型名称 */
    @Excel(name = "计时类型名称")
    private String jslxmc;

    /** 计时类型基数 */
    @Excel(name = "计时类型基数")
    private Integer jslxjs;

    /** 启用状态0否1是 */
    @Excel(name = "启用状态0否1是")
    private String qyzt;

    public void setJslxId(Long jslxId) 
    {
        this.jslxId = jslxId;
    }

    public Long getJslxId() 
    {
        return jslxId;
    }
    public void setJslxmc(String jslxmc) 
    {
        this.jslxmc = jslxmc;
    }

    public String getJslxmc() 
    {
        return jslxmc;
    }
    public void setJslxjs(Integer jslxjs) 
    {
        this.jslxjs = jslxjs;
    }

    public Integer getJslxjs() 
    {
        return jslxjs;
    }
    public void setQyzt(String qyzt) 
    {
        this.qyzt = qyzt;
    }

    public String getQyzt() 
    {
        return qyzt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("jslxId", getJslxId())
            .append("jslxmc", getJslxmc())
            .append("jslxjs", getJslxjs())
            .append("qyzt", getQyzt())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
