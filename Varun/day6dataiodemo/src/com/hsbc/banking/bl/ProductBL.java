package com.hsbc.banking.bl;

import com.hsbc.banking.exception.ProductCostException;
import com.hsbc.banking.models.Product;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProductBL {
    boolean addProduct(Product product) throws IOException, FileNotFoundException, ProductCostException;
    Product getProduct() throws IOException;
}
