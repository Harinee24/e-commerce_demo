package com.example.e_commerce.service;

import com.example.e_commerce.model.Product;
import com.example.e_commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Add a product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Delete a product
    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get a product by ID
    public Optional<Product> getProductById(String productId) {
        return productRepository.findById(productId);
    }
}

