package com.example.makeupapi.Repository;

import com.example.makeupapi.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product,Integer> {
    Optional<Product> findById(Integer id );
}
