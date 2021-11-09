package com.atguigu.boot.bean;

import javafx.scene.effect.PerspectiveTransform;

/**
 * @author mars
 * @create 2021-11-03 21:44
 */
public class User {
    private String name;
    private pet pet;

    public User() {
    }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.atguigu.boot.bean.pet getPet() {
        return pet;
    }

    public void setPet(com.atguigu.boot.bean.pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }
}
