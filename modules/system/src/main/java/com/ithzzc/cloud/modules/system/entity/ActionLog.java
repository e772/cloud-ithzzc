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
@TableName("sys_action_log")
public class ActionLog extends Model<ActionLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 日志名称
     */
    private String name;

    /**
     * 日志类型
     */
    private Integer type;

    /**
     * 操作IP地址
     */
    private String ipaddr;

    /**
     * 产生日志的类
     */
    private String clazz;

    /**
     * 产生日志的方法
     */
    private String method;

    /**
     * 产生日志的表
     */
    private String model;

    /**
     * 产生日志的数据id
     */
    @TableField("record_id")
    private Long recordId;

    /**
     * 日志消息
     */
    private String message;

    /**
     * 记录时间
     */
    @TableField("create_date")
    private Date createDate;

    /**
     * 产生日志的用户昵称
     */
    @TableField("oper_name")
    private String operName;

    /**
     * 产生日志的用户
     */
    @TableField("oper_by")
    private Long operBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }
    public Long getOperBy() {
        return operBy;
    }

    public void setOperBy(Long operBy) {
        this.operBy = operBy;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ActionLog{" +
        "id=" + id +
        ", name=" + name +
        ", type=" + type +
        ", ipaddr=" + ipaddr +
        ", clazz=" + clazz +
        ", method=" + method +
        ", model=" + model +
        ", recordId=" + recordId +
        ", message=" + message +
        ", createDate=" + createDate +
        ", operName=" + operName +
        ", operBy=" + operBy +
        "}";
    }
}
