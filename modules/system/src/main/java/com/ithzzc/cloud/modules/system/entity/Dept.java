package com.ithzzc.cloud.modules.system.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
@TableName("sys_dept")
public class Dept extends Model<Dept> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 部门名称
     */
    private String title;

    /**
     * 父级ID
     */
    private Long pid;

    /**
     * 所有父级编号
     */
    private String pids;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;

    /**
     * 更新时间
     */
    @TableField("update_date")
    private Date updateDate;

    /**
     * 创建用户
     */
    @TableField("create_by")
    private Long createBy;

    /**
     * 更新用户
     */
    @TableField("update_by")
    private Long updateBy;

    /**
     * 状态（1:正常,2:冻结,3:删除）
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
    public String getPids() {
        return pids;
    }

    public void setPids(String pids) {
        this.pids = pids;
    }
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }
    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dept{" +
        "id=" + id +
        ", title=" + title +
        ", pid=" + pid +
        ", pids=" + pids +
        ", sort=" + sort +
        ", remark=" + remark +
        ", createDate=" + createDate +
        ", updateDate=" + updateDate +
        ", createBy=" + createBy +
        ", updateBy=" + updateBy +
        ", status=" + status +
        "}";
    }
}
