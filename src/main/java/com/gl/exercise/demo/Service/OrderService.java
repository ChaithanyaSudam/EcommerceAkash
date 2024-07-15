package com.gl.exercise.demo.Service;

import com.gl.exercise.demo.Entity.Order;

import java.sql.SQLException;
import java.util.List;

public interface OrderService {

    public String getOrder(Order order) throws SQLException;
    public List<Order> GetAllOrders() throws SQLException;
}
