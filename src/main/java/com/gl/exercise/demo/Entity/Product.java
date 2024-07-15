package com.gl.exercise.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {
    private int productId;
    private String name;
    private String description;
    private int price;
    private int quantityAvailable;
    private String category;

}
