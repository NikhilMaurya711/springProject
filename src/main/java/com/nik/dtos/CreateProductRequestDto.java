package com.nik.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDto {
    private long id;
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;
}
