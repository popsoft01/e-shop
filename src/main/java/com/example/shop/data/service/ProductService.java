package com.example.shop.data.service;

import com.example.shop.data.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
}
