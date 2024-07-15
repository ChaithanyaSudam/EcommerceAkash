package com.gl.exercise.demo.Service;

import com.gl.exercise.demo.Entity.Customer;

import java.sql.SQLException;

public interface CustomerService {

    public String addCustomerDetails(Customer customer) throws SQLException;
}
