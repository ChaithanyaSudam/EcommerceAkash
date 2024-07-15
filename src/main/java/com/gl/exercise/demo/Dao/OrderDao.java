package com.gl.exercise.demo.Dao;

import com.gl.exercise.demo.Entity.Order;

import java.sql.SQLException;
import java.util.List;

public interface OrderDao {

    public String getOrderData(Order order) throws SQLException;

    public List<Order> GetOrderDataa() throws SQLException;
}
