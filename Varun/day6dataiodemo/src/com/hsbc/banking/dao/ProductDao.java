package com.hsbc.banking.dao;

import com.hsbc.banking.exception.ProductCostException;
import com.hsbc.banking.models.Product;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProductDao {
    boolean addProduct(Product product) throws IOException, FileNotFoundException, ProductCostException;
    Product getProduct() throws IOException;
}
