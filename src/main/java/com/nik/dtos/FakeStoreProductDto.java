package com.nik.dtos;

// import java.util.Locale.Category;

import com.nik.models.Product;
import com.nik.models.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private long id;
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;


    public Product toProduct(){
        Product product = new Product();

        product.setTitle(title);
        product.setDescription(description);
        product.setImageUrl(image);
        product.setPrice(price);
        
        Category category1 = new Category();
        category1.setTitle(category);

        product.setCategory(category1);

        return product;
    }
}
