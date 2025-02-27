package com.example.ProductService.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "dairy_products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;
    private String brand;
    private String category;
    private double price;
    private String quantity;

//    @ElementCollection
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Long> sellersId;

    public Product(){

    }

    public Product(String name, String brand, String category, double price, String quantity, List<Long> sellersId) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.sellersId = sellersId;
    }

    public Product(Long productId, String name, String brand, String category, double price, String quantity, List<Long> sellersId) {
        this.productId = productId;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.sellersId = sellersId;
    }

    // Getters and Setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public List<Long> getSellersId() {
        return sellersId;
    }

    public void setSellersId(List<Long> sellersId) {
        this.sellersId = sellersId;
    }
}
