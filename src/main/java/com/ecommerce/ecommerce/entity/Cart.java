package com.ecommerce.ecommerce.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(mappedBy = "cartId",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<CartItem> items;
    private Long totalPrice;
    private Long DiscountedPrice;
    private Long totalSaving;
    public Cart() {
    }
    public Cart(int id, List<CartItem> items, Long totalPrice, Long discountedPrice, Long totalSaving) {
        this.id = id;
        this.items = items;
        this.totalPrice = totalPrice;
        DiscountedPrice = discountedPrice;
        this.totalSaving = totalSaving;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<CartItem> getItems() {
        return items;
    }
    public void setItems(List<CartItem> items) {
        this.items = items;
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
    public Long getTotalSaving() {
        return totalSaving;
    }
    public void setTotalSaving(Long totalSaving) {
        this.totalSaving = totalSaving;
    }
    @Override
    public String toString() {
        return "Cart [id=" + id + ", items=" + items + ", totalPrice=" + totalPrice + ", DiscountedPrice="
                + DiscountedPrice + ", totalSaving=" + totalSaving + "]";
    }

}
