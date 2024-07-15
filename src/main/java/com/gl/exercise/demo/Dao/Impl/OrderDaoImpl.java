package com.gl.exercise.demo.Dao.Impl;

import com.gl.exercise.demo.Dao.OrderDao;
import com.gl.exercise.demo.Entity.Order;
import com.gl.exercise.demo.Util.DataBaseConn;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao {
    @Override
    public String getOrderData(Order order) throws SQLException {
        Connection connection = DataBaseConn.getConnection();
        String sql = "INSERT INTO `Order`(order_id, customer_id, product_id, quantity, order_date, status) VALUES (?,?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,order.getOrderId());
        preparedStatement.setInt(2,order.getCustomer_id());
        preparedStatement.setInt(3,order.getProduct_id());
        preparedStatement.setInt(4,order.getQuantity());
        preparedStatement.setString(5,order.getOrder_date());
        preparedStatement.setString(6,"Accepted");

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            return "Order Placed successfully with ID: " + order.getOrderId();
        } else {
            return"Failed to add order.";
        }

    }

    @Override
    public List<Order> GetOrderDataa() throws SQLException {

        List<Order> list=new ArrayList<>();
        Connection con=DataBaseConn.getConnection();
        Statement stmt=con.createStatement();
        String query="Select * from `Order`";
        ResultSet rs=stmt.executeQuery(query);

            while(rs.next())
            {
                int id=rs.getInt(1);
                System.out.println(id);
                int cid=rs.getInt(2);
                int pid=rs.getInt(3);
                int q=rs.getInt(4);
                String date=rs.getString(5);
                String status=rs.getString(6);
                list.add(new Order(id,cid,pid,q,date,status));

            }



        return list;
    }
}
