package cn.fourtwoone.mt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 单据主表(NbmtOrder)实体类
 *
 * @author makejava
 * @since 2021-06-01 20:28:16
 */
public class NbmtOrder implements Serializable {
    private static final long serialVersionUID = 242442863988383945L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 类型(出库/入库)
     */
    private String type;
    /**
     * 出入库分类
     */
    private String subType;
    /**
     * 数量
     */
    private String number;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 出入库时间
     */
    private Date operTime;
    /**
     * 供应商id
     */
    private Long supId;
    /**
     * 产品id
     */
    private Long pdtId;
    /**
     * 客户id
     */
    private Long cltId;
    /**
     * 备注
     */
    private String remark;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public Long getSupId() {
        return supId;
    }

    public void setSupId(Long supId) {
        this.supId = supId;
    }

    public Long getPdtId() {
        return pdtId;
    }

    public void setPdtId(Long pdtId) {
        this.pdtId = pdtId;
    }

    public Long getCltId() {
        return cltId;
    }

    public void setCltId(Long cltId) {
        this.cltId = cltId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}
