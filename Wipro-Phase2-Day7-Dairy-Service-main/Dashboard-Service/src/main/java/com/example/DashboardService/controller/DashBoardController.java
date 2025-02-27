package com.example.DashboardService.controller;

import com.example.DashboardService.dto.ProductDetailsDto;
import com.example.DashboardService.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashBoardController {

    @Autowired
    private ProductDetailsService productDetailsService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductDetailsDto>> getAllProducts() {
        List<ProductDetailsDto> products = productDetailsService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}
