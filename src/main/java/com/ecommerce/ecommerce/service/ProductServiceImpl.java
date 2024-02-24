package com.ecommerce.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.entity.Product;
import com.ecommerce.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private ProductRepository productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public void addProduct(Product product){
        productRepo.save(product);
    }

    public void removeProductById(int id){
        productRepo.deleteById(id);
    }

    public Optional<Product> getProductById(int id){
        return productRepo.findById(id);
    }

    public List<Product> getAllProductsByCategoryId(int id){
        return productRepo.findAllByCategory_Id(id);
    }

}
