package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员记时对象 ryjs_table
 * 
 * @author ruoyi
 * @date 2024-10-12
 */
public class RyjsTable extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 人员记时id */
    private Long ryjsId;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String ygxm;

    /** 计件类型 */
    @Excel(name = "计件类型")
    private String jjlx;

    /** 员工计件基数 */
    @Excel(name = "员工计件基数")
    private Integer ygjjjs;

    /** 员工工时 */
    @Excel(name = "员工工时")
    private BigDecimal yggs;

    public void setRyjsId(Long ryjsId) 
    {
        this.ryjsId = ryjsId;
    }

    public Long getRyjsId() 
    {
        return ryjsId;
    }
    public void setYgxm(String ygxm) 
    {
        this.ygxm = ygxm;
    }

    public String getYgxm() 
    {
        return ygxm;
    }
    public void setJjlx(String jjlx) 
    {
        this.jjlx = jjlx;
    }

    public String getJjlx() 
    {
        return jjlx;
    }
    public void setYgjjjs(Integer ygjjjs) 
    {
        this.ygjjjs = ygjjjs;
    }

    public Integer getYgjjjs() 
    {
        return ygjjjs;
    }
    public void setYggs(BigDecimal yggs) 
    {
        this.yggs = yggs;
    }

    public BigDecimal getYggs() 
    {
        return yggs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ryjsId", getRyjsId())
            .append("ygxm", getYgxm())
            .append("jjlx", getJjlx())
            .append("ygjjjs", getYgjjjs())
            .append("yggs", getYggs())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
