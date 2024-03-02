package com.ecommerce.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.ecommerce.entity.Product;

public interface ProductService {

    public Optional<Product> getProductById(int id);
    
    public List<Product> getAllProducts();

    public void addProduct(Product product);

    public void removeProductById(int id);
}
