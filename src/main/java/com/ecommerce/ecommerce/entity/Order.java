package com.ecommerce.ecommerce.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int orderId;
@ManyToOne
private User user;
private Date orderDate;
private Address shippingAddress;
private Long totalAmount;
private String status;/* (e.g., Pending, Shipped, Delivered) */
public Order() {
}
public Order(int orderId, User user, Date orderDate, Address shippingAddress, Long totalAmount, String status) {
    this.orderId = orderId;
    this.user = user;
    this.orderDate = orderDate;
    this.shippingAddress = shippingAddress;
    this.totalAmount = totalAmount;
    this.status = status;
}
public int getOrderId() {
    return orderId;
}
public void setOrderId(int orderId) {
    this.orderId = orderId;
}
public User getUser() {
    return user;
}
public void setUser(User user) {
    this.user = user;
}
public Date getOrderDate() {
    return orderDate;
}
public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
}
public Address getShippingAddress() {
    return shippingAddress;
}
public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
}
public Long getTotalAmount() {
    return totalAmount;
}
public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}

}
