package com.gl.exercise.demo.Service.Impl;

import com.gl.exercise.demo.Dao.CustomerDao;
import com.gl.exercise.demo.Dao.Impl.CustomerDaoImpl;
import com.gl.exercise.demo.Entity.Customer;
import com.gl.exercise.demo.Service.CustomerService;

import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {
    CustomerDao customerDao=new CustomerDaoImpl();
    @Override
    public String addCustomerDetails(Customer customer) throws SQLException {
        String str=customerDao.addCustomerDetails(customer);

        return str;
    }
}
