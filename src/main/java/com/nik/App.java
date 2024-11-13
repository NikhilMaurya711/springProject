package com.nik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nik.models.Product;


@SpringBootApplication
public class App{
    public static void main(String[] args) {
        Product p1 = new Product();


        SpringApplication.run(App.class, args);
    }
}
