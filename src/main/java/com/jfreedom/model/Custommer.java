package com.jfreedom.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by PC-PC on 9/8/2016.
 */
@Entity
@Table(name ="custommer")
public class Custommer implements Serializable {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="cusName")
    private String cusName;
    @Column(name = "age")
    private int age;
    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "shopId")
    Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Custommer{" +
                "id=" + id +
                ", cusName='" + cusName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", shop=" + shop +
                '}';
    }
}
