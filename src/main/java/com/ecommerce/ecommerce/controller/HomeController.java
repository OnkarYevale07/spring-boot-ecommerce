package com.ecommerce.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("/products")
    public String products(){
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
