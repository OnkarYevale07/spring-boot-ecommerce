package com.ecommerce.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(){
        return "home";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
    @GetMapping("/products")
    public String getAllProducts(){
        return "products";
    }
    @GetMapping("/cart")
    public String getCart(){
        return "cart";
    }
    @GetMapping("/pd")
    public String getProductDetails(){
        return "productDetail";
    }

}
