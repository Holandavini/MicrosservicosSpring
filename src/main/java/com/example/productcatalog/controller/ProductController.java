package com.example.productcatalog.controller;


import com.example.productcatalog.model.Product;
import com.example.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    @RequestMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return productRepository.findById(id);
    }
}
