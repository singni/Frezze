package com.frezze.domain;



public class DeptP {
    private String deptId;

    private String deptName;

    private String parentId;

    private Integer state;

    private DeptP parent;

    public DeptP getParent() {
        return parent;
    }

    public void setParent(DeptP parent) {
        this.parent = parent;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}