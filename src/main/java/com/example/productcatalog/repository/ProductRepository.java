package com.example.productcatalog.repository;

import com.example.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

// Usando o extends CrudRepository para dar funcionalidades de CRUD passando a classe gerenciada e o tipo de dado da chave primaria
public interface ProductRepository extends CrudRepository<Product, Long> {
}
