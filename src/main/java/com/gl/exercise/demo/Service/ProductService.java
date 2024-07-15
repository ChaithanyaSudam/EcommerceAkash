package com.gl.exercise.demo.Service;

import com.gl.exercise.demo.Entity.Product;

import java.sql.SQLException;

public interface ProductService {
    public String addProduct(Product product) throws SQLException;
}
