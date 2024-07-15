package com.gl.exercise.demo.Dao;

import com.gl.exercise.demo.Entity.Customer;

import java.sql.SQLException;

public interface CustomerDao {
    public String addCustomerDetails(Customer customer) throws SQLException;
}
