package com.hyecheon.springbootmongodb.service;

import com.hyecheon.springbootmongodb.commands.ProductForm;
import com.hyecheon.springbootmongodb.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}