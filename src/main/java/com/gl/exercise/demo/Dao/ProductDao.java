package com.gl.exercise.demo.Dao;

import com.gl.exercise.demo.Entity.Product;

import java.sql.SQLException;

public interface ProductDao {
   public String addProductDetails(Product product) throws SQLException;
}
