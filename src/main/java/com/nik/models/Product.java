package com.nik.models;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter

public class Product{

    private int id;
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private Category category;
}