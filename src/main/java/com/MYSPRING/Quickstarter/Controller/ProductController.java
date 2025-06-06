package com.MYSPRING.Quickstarter.Controller;

import com.MYSPRING.Quickstarter.Model.Product;
import com.MYSPRING.Quickstarter.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService = new ProductService();

    @GetMapping
    public List<Product> getproducts() {
        return productService.getProducts();
    }

    @GetMapping(path = "/{prodid}")
    public Product getprodbyid(@PathVariable int prodid) {
        return productService.getprodbyid(prodid);
    }

    @PostMapping
    public void addproduct( @RequestBody Product product) {
        productService.addProduct(product);
    }

}
