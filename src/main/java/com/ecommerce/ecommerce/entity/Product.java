package com.ecommerce.ecommerce.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    private int quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;
    private String imageName;
    @OneToOne(mappedBy = "productId",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CartItem cartItem;
    private Date createdAt;

    public Product() {
    }


    public Product(int productId, String productName, String description, String brand, String userType,
            Long originalPrice, Long discountedPrice, int discountedPercent, int quantity, Category category,
            String imageName, Date createdAt) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.brand = brand;
        this.userType = userType;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
        this.discountedPercent = discountedPercent;
        this.quantity = quantity;
        this.category = category;
        this.imageName = imageName;
        this.createdAt = createdAt;
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

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
                + ", brand=" + brand + ", userType=" + userType + ", originalPrice=" + originalPrice
                + ", discountedPrice=" + discountedPrice + ", discountedPercent=" + discountedPercent + ", quantity="
                + quantity + ", category=" + category + ", imageName=" + imageName + ", cartItem=" + cartItem
                + ", createdAt=" + createdAt + "]";
    }


}
