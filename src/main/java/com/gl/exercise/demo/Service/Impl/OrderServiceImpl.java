package com.gl.exercise.demo.Service.Impl;

import com.gl.exercise.demo.Dao.Impl.OrderDaoImpl;
import com.gl.exercise.demo.Dao.OrderDao;
import com.gl.exercise.demo.Entity.Order;
import com.gl.exercise.demo.Service.OrderService;

import java.sql.SQLException;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    OrderDao orderDao=new OrderDaoImpl();
    @Override
    public String getOrder(Order order) throws SQLException {

        String str=orderDao.getOrderData(order);

        return str;
    }

    @Override
    public List<Order> GetAllOrders() throws SQLException {
        List<Order> al=orderDao.GetOrderDataa();
        return al;
    }
}
