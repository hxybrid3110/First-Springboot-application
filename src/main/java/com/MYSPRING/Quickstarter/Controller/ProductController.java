package com.MYSPRING.Quickstarter.Controller;

import com.MYSPRING.Quickstarter.Model.Product;
import com.MYSPRING.Quickstarter.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    ProductService productService = new ProductService();

    @GetMapping(path = "/products")
    public List<Product> getproducts() {
        return productService.getProducts();
    }

    @GetMapping(path = "/products/{prodid}")
    public Product getprodbyid(@PathVariable int prodid) {
        return productService.getprodbyid(prodid);
    }

}
