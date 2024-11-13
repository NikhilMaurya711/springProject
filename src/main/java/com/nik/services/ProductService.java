package com.nik.services;
import java.util.List;

import com.nik.dtos.CreateProductRequestDto;
import com.nik.models.Product;

public interface ProductService {

    List<Product> getAllProducts();

    Product getSingleProduct(long id);

    Product createProduct(CreateProductRequestDto createProductRequestDto);
    
}