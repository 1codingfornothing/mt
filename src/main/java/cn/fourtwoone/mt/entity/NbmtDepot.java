package cn.fourtwoone.mt.entity;

import java.io.Serializable;

/**
 * 仓库表(NbmtDepot)实体类
 *
 * @author makejava
 * @since 2021-06-01 20:28:15
 */
public class NbmtDepot implements Serializable {
    private static final long serialVersionUID = -85251729631735366L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 仓库名称
     */
    private String name;
    /**
     * 仓库地址
     */
    private String address;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 容量
     */
    private Integer size;
    /**
     * 排序
     */
    private String sort;
    /**
     * 描述
     */
    private String remark;
    /**
     * 删除标记，0未删除，1删除
     */
    private String deleteFlag;
    /**
     * 是否默认
     */
    private Object isDefault;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Object getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Object isDefault) {
        this.isDefault = isDefault;
    }

}
