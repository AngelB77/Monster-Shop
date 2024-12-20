package com.example.Monster.Shop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="products")
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String imageUrl;
    private double rating;
    private int reviewCount;
    private boolean featured;

    public Product(String name, double price, String imageUrl, double rating, int reviewCount, boolean featured) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.featured = featured;
    }

}
