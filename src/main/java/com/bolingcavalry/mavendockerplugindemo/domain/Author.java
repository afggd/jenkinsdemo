package com.bolingcavalry.mavendockerplugindemo.domain;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className Author
 * @date 2019/4/28
 **/
public class Author {
    private long id;//用户ID.
    private String name;//测试名称.
    // SET和GET方法

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
