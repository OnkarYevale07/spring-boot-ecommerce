package com.ecommerce.ecommerce.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;
    @ManyToOne
    private User user;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product> product;
    private int quantity;
    private Long totalPrice;
    private Long discountedPrice;
    public Cart() {
    }
    public Cart(int cartId, User user, Set<Product> product, int quantity, Long totalPrice, Long discountedPrice) {
        this.cartId = cartId;
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.discountedPrice = discountedPrice;
    }
    public int getCartId() {
        return cartId;
    }
    public void setCartId(int cartId) {
        this.cartId = cartId;
    }
    public User getUserid() {
        return user;
    }
    public void setUserid(User user) {
        this.user = user;
    }
    public Set<Product> getProduct() {
        return product;
    }
    public void setProduct(Set<Product> product) {
        this.product = product;
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
        return discountedPrice;
    }
    public void setDiscountedPrice(Long discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

}
