package com.gl.exercise.demo.Service.Impl;

import com.gl.exercise.demo.Dao.Impl.ProductDaoImpl;
import com.gl.exercise.demo.Dao.ProductDao;
import com.gl.exercise.demo.Entity.Product;
import com.gl.exercise.demo.Service.ProductService;

import java.sql.SQLException;

public class ProductServiceImpl implements ProductService {
    ProductDao productDao=new ProductDaoImpl();
    @Override
    public String addProduct(Product product) throws SQLException {
        String str=productDao.addProductDetails(product);

        return str;
    }
}
