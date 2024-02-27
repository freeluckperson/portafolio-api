package com.cryptograming.resapi.repository;

import com.cryptograming.resapi.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}


