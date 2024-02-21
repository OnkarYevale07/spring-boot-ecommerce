package com.ecommerce.ecommerce.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private String description;
    private String brand;
    private String userType;
    private Long originalPrice;
    private Long discountedPrice;
    private int discountedPercent;
    private boolean availability;
    private int quantity;


    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cart cart;

    public Product() {
    }

    public Product(int productId, String productName, String description, String brand, String userType,
            Long originalPrice, Long discountedPrice, int discountedPercent, boolean availability, int quantity,
            Category category, Cart cart) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.brand = brand;
        this.userType = userType;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.discountedPercent = discountedPercent;
        this.availability = availability;
        this.quantity = quantity;
        this.category = category;
        this.cart = cart;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Long getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(Long discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public int getDiscountedPercent() {
        return discountedPercent;
    }

    public void setDiscountedPercent(int discountedPercent) {
        this.discountedPercent = discountedPercent;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

}
