package com.example.ProductService.service;

import com.example.ProductService.model.Product;
import com.example.ProductService.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
