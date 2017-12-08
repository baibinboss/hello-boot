package com.baibin.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "car_driver")
public class CarDriver {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 部门线code
     */
    @Column(name = "org_path_code")
    private String orgPathCode;

    /**
     * 部门线名称
     */
    @Column(name = "org_path_name")
    private String orgPathName;

    /**
     * 部门名称
     */
    @Column(name = "dept_name")
    private String deptName;

    /**
     * 部门编码
     */
    @Column(name = "dept_code")
    private String deptCode;

    /**
     * 司机名称
     */
    private String name;

    /**
     * 联系方式(手机号码)
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 最后修改时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 最后修改人
     */
    @Column(name = "update_user")
    private Integer updateUser;

    /**
     * 人员类型 0:车队长 1：司机 3：管理员 4：预约用户
     */
    @Column(name = "person_type")
    private Integer personType;

    /**
     * 员工编号
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 司机图片
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 是否删除
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门线code
     *
     * @return org_path_code - 部门线code
     */
    public String getOrgPathCode() {
        return orgPathCode;
    }

    /**
     * 设置部门线code
     *
     * @param orgPathCode 部门线code
     */
    public void setOrgPathCode(String orgPathCode) {
        this.orgPathCode = orgPathCode;
    }

    /**
     * 获取部门线名称
     *
     * @return org_path_name - 部门线名称
     */
    public String getOrgPathName() {
        return orgPathName;
    }

    /**
     * 设置部门线名称
     *
     * @param orgPathName 部门线名称
     */
    public void setOrgPathName(String orgPathName) {
        this.orgPathName = orgPathName;
    }

    /**
     * 获取部门名称
     *
     * @return dept_name - 部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置部门名称
     *
     * @param deptName 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 获取部门编码
     *
     * @return dept_code - 部门编码
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置部门编码
     *
     * @param deptCode 部门编码
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * 获取司机名称
     *
     * @return name - 司机名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置司机名称
     *
     * @param name 司机名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取联系方式(手机号码)
     *
     * @return mobile - 联系方式(手机号码)
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置联系方式(手机号码)
     *
     * @param mobile 联系方式(手机号码)
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取电子邮箱
     *
     * @return email - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取最后修改时间
     *
     * @return update_date - 最后修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置最后修改时间
     *
     * @param updateDate 最后修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取最后修改人
     *
     * @return update_user - 最后修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置最后修改人
     *
     * @param updateUser 最后修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取人员类型 0:车队长 1：司机 3：管理员 4：预约用户
     *
     * @return person_type - 人员类型 0:车队长 1：司机 3：管理员 4：预约用户
     */
    public Integer getPersonType() {
        return personType;
    }

    /**
     * 设置人员类型 0:车队长 1：司机 3：管理员 4：预约用户
     *
     * @param personType 人员类型 0:车队长 1：司机 3：管理员 4：预约用户
     */
    public void setPersonType(Integer personType) {
        this.personType = personType;
    }

    /**
     * 获取员工编号
     *
     * @return user_id - 员工编号
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置员工编号
     *
     * @param userId 员工编号
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取司机图片
     *
     * @return pic_url - 司机图片
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置司机图片
     *
     * @param picUrl 司机图片
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 获取是否删除
     *
     * @return is_deleted - 是否删除
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isDeleted 是否删除
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}