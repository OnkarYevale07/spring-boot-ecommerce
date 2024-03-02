package com.ecommerce.ecommerce.global;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.ecommerce.entity.Product;

public class GlobalData {
    
    public static List<Product> cart;

    static{
        cart = new ArrayList<Product>();
    }
}
