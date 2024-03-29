package com.ecommerce.ecommerce.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    List<Product> findAllByCategory_Id(int id);
}
