package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem,Integer>{
    
}
