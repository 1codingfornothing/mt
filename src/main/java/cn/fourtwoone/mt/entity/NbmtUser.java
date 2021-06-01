package cn.fourtwoone.mt.entity;

import java.io.Serializable;

/**
 * 用户表(NbmtUser)实体类
 *
 * @author makejava
 * @since 2021-06-01 20:28:19
 */
public class NbmtUser implements Serializable {
    private static final long serialVersionUID = -28556088895955543L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 用户姓名--例如张三
     */
    private String username;
    /**
     * 登录用户名
     */
    private String loginName;
    /**
     * 登陆密码
     */
    private String password;
    /**
     * 职位
     */
    private String position;
    /**
     * 所属部门
     */
    private String department;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String phonenum;
    /**
     * 是否为管理者 0==管理者 1==员工
     */
    private Object ismanager;
    /**
     * 状态，0：正常，1：删除，2封禁
     */
    private Object status;
    /**
     * 用户描述信息
     */
    private String description;
    /**
     * 备注
     */
    private String remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public Object getIsmanager() {
        return ismanager;
    }

    public void setIsmanager(Object ismanager) {
        this.ismanager = ismanager;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
