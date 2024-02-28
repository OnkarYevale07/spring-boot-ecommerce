package com.ecommerce.ecommerce.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.ecommerce.entity.Category;
import com.ecommerce.ecommerce.entity.Product;
import com.ecommerce.ecommerce.service.CategoryService;
import com.ecommerce.ecommerce.service.ProductService;
import com.ecommerce.ecommerce.service.UserService;

@Controller
public class AdminController {

    public static String uploadDir = System.getProperty("user.dir")+"/src/main/resources/static/products";

    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    UserService userService;

    @GetMapping("/admin")
    public String adminHome(){
        return "admin/adminHome";
    }

    
    @GetMapping("/admin/categories")
    public String getCategories(Model model){
        model.addAttribute("categories", categoryService.getAllCategories());
        return "admin/categories";
    }

    @GetMapping("/admin/categories/add")
    public String getCategoryAdd(Model model){
        model.addAttribute("category", new Category());
        return "admin/categoriesAdd";
    }
    @PostMapping("/admin/categories/add")
    public String postCategoryAdd(@ModelAttribute("category")Category category){
        categoryService.addCategory(category);
        return "redirect:/admin/categories";
    }

    @GetMapping("/admin/categories/delete/{id}")
    public String deleteCategory(@PathVariable int id){
        categoryService.removeCategoryById(id);
        return "redirect:/admin/categories";
    }

    @GetMapping("/admin/categories/update/{id}")
    public String updateCategory(@PathVariable int id, Model model){
        Optional<Category> category = categoryService.getCategoryById(id);
        if(category.isPresent()){
            model.addAttribute("category", category.get());
            return "admin/categoriesAdd";
        }else{
            return "404";
        }
    }

    @GetMapping("/admin/products")
    public String products(Model model){
        model.addAttribute("products",productService.getAllProducts());
        return "admin/products";
    }



    // User Section Start
    @GetMapping("/admin/users")
    public String users(Model model){
        model.addAttribute("users",userService.getAllUsers());
        return "users";
    }


    @GetMapping("/admin/users")
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.getAllUsers());
        return "users";
    }


    // User Section End



    // Product Section Start
     
    @GetMapping("/admin/products/add")
    public String addProduct(Model model){
        model.addAttribute("productDTO", new Product());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "productsAdd";
    }

    @PostMapping("/admin/products/add")
    public String productAddPost(@ModelAttribute("productDTO")Product product1,@RequestParam("productImage")MultipartFile file, @RequestParam("imgName")String imgName)throws IOException{

        Product product = new Product();
        product.setProductId(product1.getProductId());
        product.setProductName(product1.getProductName());
        product.setBrand(product1.getBrand());
        product.setUserType(product1.getUserType());
        product.setCategory(categoryService.getCategoryById(product1.getCategory().getId()).get());
        product.setOriginalPrice(product1.getOriginalPrice());
        product.setDiscountedPrice(product1.getDiscountedPrice());
        product.setQuantity(product1.getQuantity());
        product.setDescription(product1.getDescription());

        String imageUUID;
        if(!file.isEmpty()){
            imageUUID = file.getOriginalFilename();
            Path fileNameAndPath = Paths.get(uploadDir, imageUUID);
            Files.write(fileNameAndPath, file.getBytes());
        }else{
            imageUUID = imgName;
        }
        product1.setImageName(imageUUID);
        productService.addProduct(product);

        return "redirect:/admin/products";
    }

    @GetMapping("/admin/product/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        productService.removeProductById(id);
        return "redirect:/admin/products";
    }

    // Product Section End
}
