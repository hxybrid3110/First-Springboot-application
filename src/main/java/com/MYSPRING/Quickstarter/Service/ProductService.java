package com.MYSPRING.Quickstarter.Service;


import com.MYSPRING.Quickstarter.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();
    public ProductService() {
        products.add(new Product(101,"bat",4000));
        products.add(new Product(102,"ball",500));
    }



    public List<Product> getProducts(){
        return products;
    }

    public Product getprodbyid(int id){
        return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }
}
