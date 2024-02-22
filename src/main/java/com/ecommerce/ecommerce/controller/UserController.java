package com.ecommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/home")
    public String userHome( Model model){

        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/do_login")
    public String doLogin(@RequestParam("username") String name,@RequestParam("password") String pass, HttpSession session){
       User user =  userService.findByEmail(name);
       if(user != null){
        if(user.getEmail().equals(name) && (user.getPassword().equals(pass))){
            System.out.println("success");
            return "redirect:/user/home";
           }else{
            System.out.println("Invalid Credentials !");
            System.out.println(user.getEmail());
            System.out.println(name);
            session.setAttribute("msg1", "Invalid Credentials!");
            return "redirect:/user/login";
           }
       }else{
        System.out.println("User not registered");
            session.setAttribute("msg1", "User not registered");
            return "redirect:/user/login";
       }

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
