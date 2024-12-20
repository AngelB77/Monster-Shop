package com.example.Monster.Shop.repository;

import com.example.Monster.Shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
