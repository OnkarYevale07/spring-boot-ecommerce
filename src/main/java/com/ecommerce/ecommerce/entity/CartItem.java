package com.ecommerce.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    private Product productId;
    private int quantity;
    private Long totalPrice;
    private Long DiscountedPrice;
    @ManyToOne
    private Cart cartId;
    public CartItem() {
    }
    public CartItem(int id, Product productId, int quantity, Long totalPrice, Long discountedPrice) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        DiscountedPrice = discountedPrice;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Product getProductId() {
        return productId;
    }
    public void setProductId(Product productId) {
        this.productId = productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Long getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Long getDiscountedPrice() {
        return DiscountedPrice;
    }
    public void setDiscountedPrice(Long discountedPrice) {
        DiscountedPrice = discountedPrice;
    }
    public Cart getCartId() {
        return cartId;
    }
    public void setCartId(Cart cartId) {
        this.cartId = cartId;
    }
    @Override
    public String toString() {
        return "CartItem [id=" + id + ", productId=" + productId + ", quantity=" + quantity + ", totalPrice="
                + totalPrice + ", DiscountedPrice=" + DiscountedPrice + ", cartId=" + cartId + "]";
    }
   

}
