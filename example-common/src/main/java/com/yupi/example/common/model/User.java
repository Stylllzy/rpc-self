package com.yupi.example.common.model;

import java.io.Serializable;    // 作用：序列化接口，实现该接口的类可以被序列化和反序列化

/**
 * 用户
 */
public class User implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
