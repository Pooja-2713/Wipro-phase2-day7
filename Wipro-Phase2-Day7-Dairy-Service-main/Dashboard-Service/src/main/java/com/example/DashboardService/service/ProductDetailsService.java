package com.example.DashboardService.service;

import com.example.DashboardService.dto.ProductDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductDetailsService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String PRODUCT_SERVICE_URL = "http://localhost:8085/product";

    public List<ProductDetailsDto> getAllProducts() {
        try {
            String url = PRODUCT_SERVICE_URL + "/list";
            ProductDetailsDto[] productArray = restTemplate.getForObject(url, ProductDetailsDto[].class);
            return productArray != null ? Arrays.asList(productArray) : List.of();
        } catch (Exception e) {
            throw new RuntimeException("Error fetching products from Product Service", e);
        }
    }
}
