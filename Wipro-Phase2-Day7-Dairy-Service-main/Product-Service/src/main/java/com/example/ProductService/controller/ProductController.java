package com.example.ProductService.controller;


import com.example.ProductService.model.Product;
import com.example.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin()
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<>("Product Added Successfully!", HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Product>> listProduct(){
        List<Product> allProducts = productService.getAllProducts();
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }
}
