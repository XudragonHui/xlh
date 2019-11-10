package com.jk.model;

/**
 * author:xyy
 * createtime:2019/11/8
 * email:
 * tel:
 */

public class EmpBean {
    /*员工表：id、姓名、密码、职位、部门、薪资、座右铭
    职位表：id、职位名称
    部门表：id、部门名称*/

    private Integer id;
    private String name;
    private String password;
    private Integer deptId;

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    private double money;
    private String zym;

    private Integer zhiweiId;
    private String zhiweiName;

    public String getZhiweiName() {
        return zhiweiName;
    }

    public void setZhiweiName(String zhiweiName) {
        this.zhiweiName = zhiweiName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getZhiweiId() {
        return zhiweiId;
    }

    public void setZhiweiId(Integer zhiweiId) {
        this.zhiweiId = zhiweiId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getZym() {
        return zym;
    }

    public void setZym(String zym) {
        this.zym = zym;
    }
}
