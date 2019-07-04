package com.example.demo.pattern;

/**
 * Created jixinshi on 2019-07-04.
 */
public enum ExecutorType {

    FIRST("firstExecutor", "first desc"),

    SECOND("secondExecutor", "second desc");

    ExecutorType(String bean, String desc) {
        this.bean = bean;
        this.desc = desc;
    }

    private String bean;

    private String desc;

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }}
