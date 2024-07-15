package com.gl.exercise.demo.Dao.Impl;

import com.gl.exercise.demo.Dao.ProductDao;
import com.gl.exercise.demo.Entity.Product;
import com.gl.exercise.demo.Util.DataBaseConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDaoImpl implements ProductDao {
    @Override
    public String addProductDetails(Product product)  {


        try {


            Connection connection = DataBaseConn.getConnection();
            String sql = "INSERT INTO Product (product_id, name, description, price, quantity_available, category) VALUES (?,?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getProductId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setInt(4, product.getPrice());
            preparedStatement.setInt(5, product.getQuantityAvailable());
            preparedStatement.setString(6, product.getCategory());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                return "Product added successfully with ID: " + product.getProductId();
            } else {
                return"Failed to add product.";
            }
        }
        catch (SQLException e){
            System.out.println("error in inserting data");
        }
        return "Product added Successfully"+product.getProductId();
    }
}
