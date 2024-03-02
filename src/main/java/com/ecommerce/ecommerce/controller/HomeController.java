package com.ecommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.ecommerce.service.ProductService;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;
    
    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("/products")
    public String products(Model m){
        m.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping("/brands")
    public String brand(){
        return "brands";
    }

}
