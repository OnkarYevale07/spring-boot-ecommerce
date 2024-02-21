package com.ecommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.ecommerce.entity.Address;
import com.ecommerce.ecommerce.entity.User;
import com.ecommerce.ecommerce.service.AddressService;
import com.ecommerce.ecommerce.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    private AddressService addressService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/do_login")
    public String doLogin(@ModelAttribute User user, HttpSession session){
        // userService.getUserById();
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
    
    @PostMapping("/do_register")
    public String saveUser(@ModelAttribute User user, HttpSession session){
        User savedUser = userService.saveUser(user);
        if(savedUser != null){
            session.setAttribute("msg", "Registered Successfully!");
            
        }else{
            session.setAttribute("msg", "Something Went Wrong On Server!");
        }
        return "redirect:/user/register";
    }
    
    @PostMapping("/add_address")
    public String saveAddress(@ModelAttribute Address address){
        addressService.saveAddress(address);
        return "address_save";
    }
    
    @GetMapping("/cart")
    public String getCart(){
        return "cart";
    }
        
}
