package com.gl.exercise.demo.Dao.Impl;

import com.gl.exercise.demo.Dao.CustomerDao;
import com.gl.exercise.demo.Entity.Customer;
import com.gl.exercise.demo.Util.DataBaseConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public String addCustomerDetails(Customer customer) throws SQLException {

        Connection connection= DataBaseConn.getConnection();
        String sql="INSERT INTO Customer (customer_id, name, email, address,phone_number) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,customer.getCustomerId());
        preparedStatement.setString(2,customer.getName());
        preparedStatement.setString(3,customer.getEmail());
        preparedStatement.setString(4,customer.getAddress());
        preparedStatement.setString(5,customer.getPhoneNumber());

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            return "Customer added successfully with ID: " + customer.getCustomerId();
        } else {
            return"Failed to add customer.";
        }

    }
}
