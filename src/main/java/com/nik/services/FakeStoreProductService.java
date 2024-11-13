package com.nik.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.el.stream.Stream;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nik.config.restTemplateConfig;
import com.nik.dtos.CreateProductRequestDto;
import com.nik.dtos.FakeStoreProductDto;
import com.nik.models.Product;

@Service
public class FakeStoreProductService implements ProductService {

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDto[] fakeStoreProductDtos = restTemplate
                .getForObject("https://fakestoreapi.com/products", FakeStoreProductDto[].class);

        List<Product> products = new ArrayList<>();

        for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
            products.add(fakeStoreProductDto.toProduct());
        }
        return products;
    }

    @Override
    public Product getSingleProduct(long id) {

        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class);

        return fakeStoreProductDto.toProduct();
    }

    @Override
    public Product createProduct(CreateProductRequestDto createProductRequestDto) {
        throw new UnsupportedOperationException("Unimplemented method 'createProduct'");
    }

}
