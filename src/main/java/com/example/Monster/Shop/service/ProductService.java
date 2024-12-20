package com.example.Monster.Shop.service;

import com.example.Monster.Shop.model.Product;
import com.example.Monster.Shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product addProduct(Product newProduct){
        return productRepository.save(newProduct);
    }
}
