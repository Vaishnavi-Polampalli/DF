package com.df.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int product_id;
    private String product_name;

    public Product() {
    }

    private int price;

    public Product(int product_id, String product_name, int price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
