package com.example.ProductService.model;

import jakarta.persistence.*;

//@Entity
//@Table(name = "sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sellerId; // Changed from userId to match product-seller relationship

    private String username;
    private String email;
    private String role;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public Seller() {
    }

    public Seller(String username, String email, String role, Product product) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.product = product;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerId=" + sellerId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", product=" + product.getName() + // Avoid infinite loop in bidirectional relationship
                '}';
    }
}
