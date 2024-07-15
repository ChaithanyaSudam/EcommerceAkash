package com.gl.exercise.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    private int orderId;
    private int customer_id;
    private int product_id;
    private int quantity;
    private String order_date;
    private String status;


}
