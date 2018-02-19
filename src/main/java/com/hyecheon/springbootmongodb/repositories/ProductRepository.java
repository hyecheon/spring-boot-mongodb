package com.hyecheon.springbootmongodb.repositories;

import com.hyecheon.springbootmongodb.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
