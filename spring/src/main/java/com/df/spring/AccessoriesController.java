package com.df.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessoriesController {

    @RequestMapping("/about")
    public String about(){
        return "Details about accessories";
    }

    @RequestMapping("/buy")
    public String buy(){
        return "Buy these products";
    }

    @RequestMapping("/cart")
    public String cart(){
        return "Add to cart";
    }
}
