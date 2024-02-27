package com.cryptograming.resapi.controller;


import com.cryptograming.resapi.entity.Product;
import com.cryptograming.resapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> allTask() {
        List<Product> product = productService.getAllTasks();
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> taskById(@PathVariable String id) {
        Optional<Product> product = productService.getProductById(id);
        return new ResponseEntity<>(product.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleted(@PathVariable String id) {
        productService.taskEraser(id);
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        Product createdProduct = productService.createOrUpdateProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }
}
