package cn.fourtwoone.mt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 供应商表(NbmtSupplier)实体类
 *
 * @author makejava
 * @since 2021-06-01 20:28:18
 */
public class NbmtSupplier implements Serializable {
    private static final long serialVersionUID = -83058756219175539L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 供应商编号
     */
    private String supNo;
    /**
     * 供应商名称
     */
    private String supName;
    /**
     * 供应商显示顺序
     */
    private String sort;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 删除标记，0未删除，1删除
     */
    private String deleteFlag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupNo() {
        return supNo;
    }

    public void setSupNo(String supNo) {
        this.supNo = supNo;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}
