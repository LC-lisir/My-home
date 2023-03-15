package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")   //映射到数据库中的表
public class User {
    @Id     //表示指定实体类中用于数据映射的主键是谁
    @GeneratedValue(strategy = GenerationType.IDENTITY)
              //  开启主键自增功能
    private Long id;
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private String phone;
    @Column(name = "create_time")  // 映射规则，表示与数据库中的字段对应
    private String createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
