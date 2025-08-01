package com.example.restapiproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restapiproduct.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
