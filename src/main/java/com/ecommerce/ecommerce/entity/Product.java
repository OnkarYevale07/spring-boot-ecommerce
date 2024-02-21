package com.ecommerce.ecommerce.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String category;
    private List<String> imageUrl;
    @OneToOne(mappedBy = "productId",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CartItem cartItem;

    public Product() {
    }

    public Product(int productId, String productName, String description, String brand, String userType,
            Long originalPrice, Long discountedPrice, int discountedPercent, boolean availability, int quantity,
            String category, List<String> imageUrl) {
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
        this.imageUrl = imageUrl;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
                + ", brand=" + brand + ", userType=" + userType + ", originalPrice=" + originalPrice
                + ", discountedPrice=" + discountedPrice + ", discountedPercent=" + discountedPercent
                + ", availability=" + availability + ", quantity=" + quantity + ", category=" + category + ", imageUrl="
                + imageUrl + ", cartItem=" + cartItem + "]";
    }

}
