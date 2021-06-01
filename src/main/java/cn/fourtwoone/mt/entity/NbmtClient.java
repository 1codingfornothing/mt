package cn.fourtwoone.mt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 客户表(NbmtClient)实体类
 *
 * @author makejava
 * @since 2021-06-01 20:28:10
 */
public class NbmtClient implements Serializable {
    private static final long serialVersionUID = -50729954446460708L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 客户编号
     */
    private String cltNo;
    /**
     * 客户名称
     */
    private String cltName;
    /**
     * 客户显示顺序
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

    public String getCltNo() {
        return cltNo;
    }

    public void setCltNo(String cltNo) {
        this.cltNo = cltNo;
    }

    public String getCltName() {
        return cltName;
    }

    public void setCltName(String cltName) {
        this.cltName = cltName;
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
