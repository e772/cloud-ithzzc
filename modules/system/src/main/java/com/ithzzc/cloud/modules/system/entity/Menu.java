package com.ithzzc.cloud.modules.system.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
@TableName("sys_menu")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 菜单名称
     */
    private String title;

    /**
     * 父级编号
     */
    private Long pid;

    /**
     * 所有父级编号
     */
    private String pids;

    /**
     * URL地址
     */
    private String url;

    /**
     * 权限标识
     */
    private String perms;

    /**
     * 图标
     */
    private String icon;

    /**
     * 类型（1:一级菜单,2:子级菜单,3:不是菜单）
     */
    private Byte type;

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
    
    @TableField(exist=false)
    @JsonIgnore
    private Map<Long, Menu> children = new HashMap<>();
    
    

    public Map<Long, Menu> getChildren() {
		return children;
	}

	public void setChildren(Map<Long, Menu> children) {
		this.children = children;
	}

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
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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
        return "Menu{" +
        "id=" + id +
        ", title=" + title +
        ", pid=" + pid +
        ", pids=" + pids +
        ", url=" + url +
        ", perms=" + perms +
        ", icon=" + icon +
        ", type=" + type +
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
