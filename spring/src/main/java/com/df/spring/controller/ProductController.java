package com.df.spring.controller;

import com.df.spring.model.Product;
import com.df.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService ps;

    @RequestMapping("/")
    public String about(){
        return "Welcome to our page";
    }

    @RequestMapping("/buy/{prod_id}")
    public Product buy(@PathVariable int prod_id){
        return ps.get(prod_id);
    }

    @RequestMapping("/buyAll")
    public List<Product> buyAll(){
        return ps.getAll();
    }


}
