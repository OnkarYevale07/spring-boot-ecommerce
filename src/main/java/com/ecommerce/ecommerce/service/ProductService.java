package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.ecommerce.model.Product;

public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAllProducts();

    public Boolean deleteProduct(int id);

    public Product getProductById(int id);

    public Product updateProduct(Product product, MultipartFile file);

    public List<Product> getAllActiveProducts(String category);
}
