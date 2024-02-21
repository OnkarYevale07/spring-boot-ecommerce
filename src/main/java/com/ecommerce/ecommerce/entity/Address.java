package com.ecommerce.ecommerce.entity;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String addressName;
    private String city;
    private String state;
    private String zipcode;
    private String mobileNo;
    @ManyToOne(cascade = CascadeType.ALL)
    private List<User> user;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Order> order;
    public Address() {
    }
    public Address(int addressId, String addressName, String city, String state, String zipcode, String mobileNo,
            List<User> user, Set<Order> order) {
        this.addressId = addressId;
        this.addressName = addressName;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.mobileNo = mobileNo;
        this.user = user;
        this.order = order;
    }
    public int getAddressId() {
        return addressId;
    }
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
    public String getAddressName() {
        return addressName;
    }
    public void setAddressName(String addressName) {
        this.addressName = addressName;
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
    public List<User> getUser() {
        return user;
    }
    public void setUser(List<User> user) {
        this.user = user;
    }
    public Set<Order> getOrder() {
        return order;
    }
    public void setOrder(Set<Order> order) {
        this.order = order;
    }
    
}
