package com.hsbc.ecommerce.dao;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hsbc.ecommerce.models.Products;



public interface ProductsDao {
	boolean addProduct(List<Products>  products) throws  IOException ;
	List<Products> getAllProducts(String category) throws IOException, ClassNotFoundException ;

}
