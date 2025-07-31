package com.example.restapiproduct.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restapiproduct.entity.Product;
import com.example.restapiproduct.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }

}
