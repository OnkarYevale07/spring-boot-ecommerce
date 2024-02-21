package com.ecommerce.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private String state;
    private String zipcode;
    private String mobileNo;
    @ManyToOne
    private User user;
    public Address() {
    }
    public Address(int id, String name, String city, String state, String zipcode, String mobileNo, User userId) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.mobileNo = mobileNo;
        this.user = userId;
    }
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
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public User getUserId() {
        return user;
    }
    public void setUserId(User userId) {
        this.user = userId;
    }
    @Override
    public String toString() {
        return "Address [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
                + ", mobileNo=" + mobileNo + ", user=" + user + "]";
    }

}
