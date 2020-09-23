package com.hsbc.banking.bl;

import com.hsbc.banking.dao.ProductDao;
import com.hsbc.banking.dao.ProductDaoImpl;
import com.hsbc.banking.exception.ProductCostException;
import com.hsbc.banking.models.Product;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ProductBLImpl implements ProductBL{

    private ProductDao productDao;

    public ProductBLImpl(String fileName) throws IOException {
        productDao = new ProductDaoImpl(fileName);
    }

    @Override
    public boolean addProduct(Product product) throws IOException, FileNotFoundException, ProductCostException {
        return productDao.addProduct(product);
    }

    @Override
    public Product getProduct() throws IOException {
        return productDao.getProduct();
    }
}
