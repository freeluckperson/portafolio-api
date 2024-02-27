package com.cryptograming.resapi.service;

import com.cryptograming.resapi.entity.Product;
import com.cryptograming.resapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllTasks() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Product createOrUpdateProduct(Product product) {
        return productRepository.save(product);
    }

    public void taskEraser(String id) {
        productRepository.deleteById(id);
    }
}

