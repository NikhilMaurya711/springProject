package com.nik.controller;

import org.springframework.web.bind.annotation.RestController;

import com.nik.dtos.CreateProductRequestDto;
import com.nik.models.Product;
import com.nik.services.ProductService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProductController {
    public ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    

    @GetMapping("/products/{id}")
    public Product getOneProducts(@PathVariable("id") long id) {
        return productService.getSingleProduct(id);
    }
    
    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return productService.createProduct(createProductRequestDto);
    }
    
    
}
