package com.hsbc.banking.views;

import com.hsbc.banking.bl.ProductBL;
import com.hsbc.banking.bl.ProductBLImpl;
import com.hsbc.banking.exception.ProductCostException;
import com.hsbc.banking.models.Product;

import java.io.IOException;
import java.time.LocalDate;

public class ProductApp {

    private static ProductBL productBL;
    static {
        try {
            productBL = new ProductBLImpl("ProductInfo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductID(432156465L);
        product.setName("Handset");
        product.setDop(LocalDate.of(2020, 3, 27));
        product.setCost(2500);
        product.setStatus(true);

        try {
            productBL.addProduct(product);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ProductCostException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(productBL.getProduct().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
