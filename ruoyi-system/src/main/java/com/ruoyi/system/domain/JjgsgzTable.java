package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工资对象 jjgsgz_table
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
public class JjgsgzTable extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 计件工时工资id */
    private Long jjgsgzId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String ygxm;

    /** 统计月份 */
    @Excel(name = "统计月份")
    private String tjyf;

    /** 员工计件基数 */
    @Excel(name = "员工计件基数")
    private Integer ygjjjs;

    /** 计件工时 */
    @Excel(name = "计件工时")
    private BigDecimal jjzgs;

    /** 计件月工资 */
    @Excel(name = "计件月工资")
    private BigDecimal jjygz;

    public void setJjgsgzId(Long jjgsgzId) 
    {
        this.jjgsgzId = jjgsgzId;
    }

    public Long getJjgsgzId() 
    {
        return jjgsgzId;
    }
    public void setYgxm(String ygxm) 
    {
        this.ygxm = ygxm;
    }

    public String getYgxm() 
    {
        return ygxm;
    }
    public void setTjyf(String tjyf) 
    {
        this.tjyf = tjyf;
    }

    public String getTjyf() 
    {
        return tjyf;
    }
    public void setYgjjjs(Integer ygjjjs) 
    {
        this.ygjjjs = ygjjjs;
    }

    public Integer getYgjjjs() 
    {
        return ygjjjs;
    }
    public void setJjzgs(BigDecimal jjzgs) 
    {
        this.jjzgs = jjzgs;
    }

    public BigDecimal getJjzgs() 
    {
        return jjzgs;
    }

    public void setJjygz(BigDecimal jjygz)
    {
        this.jjygz = jjygz;
    }

    public BigDecimal getJjygz()
    {
        return jjygz;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("jjgsgzId", getJjgsgzId())
            .append("ygxm", getYgxm())
            .append("tjyf", getTjyf())
            .append("ygjjjs", getYgjjjs())
            .append("jjzgs", getJjzgs())
            .append("jjygz", getJjygz())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
