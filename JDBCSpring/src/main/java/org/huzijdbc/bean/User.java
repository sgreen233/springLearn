package org.huzijdbc.bean;

import java.io.Serializable;
//实现一个序列化的对象
public class User implements Serializable {
    private static final long serialVersionUID = -334448898998889L;
    private int id;
    private String name;
    private int age;
    private int sex;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
