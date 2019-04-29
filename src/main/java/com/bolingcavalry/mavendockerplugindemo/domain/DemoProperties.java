package com.bolingcavalry.mavendockerplugindemo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author zzq
 * @version 1.0
 * @className demoProperties
 * @date 2019/4/29
 **/
@Component
@ConfigurationProperties(prefix = "my1")
public class DemoProperties {

    private int age;
    private String name;
    // 省略 get set


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoProperties{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}