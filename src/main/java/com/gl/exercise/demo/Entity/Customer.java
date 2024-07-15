package com.gl.exercise.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter@Getter
public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String address;
    private String PhoneNumber;

}
