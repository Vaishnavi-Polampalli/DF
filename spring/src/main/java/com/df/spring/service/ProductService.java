package com.df.spring.service;

import com.df.spring.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= Arrays.asList(
            new Product(1, "Eyeshades", 30),
            new Product(2, "Compact", 50),
            new Product(3,"Concealer",40));

    public List<Product> getAll(){
        return products;
    }

    public Product get(int prod_id){
        for(Product p:products){
            if(p.getProduct_id()==prod_id) {
                return p;
            }
        }
        return new Product(0,"No product",0 );
    }


}
