package com.yyr.modules.category.entity;

public class Category {
    private Integer id;
    private String name;
    private String remarks;
    private String delFlag;

    public Category() {
        this.delFlag = "0";
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remarks='" + remarks + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
