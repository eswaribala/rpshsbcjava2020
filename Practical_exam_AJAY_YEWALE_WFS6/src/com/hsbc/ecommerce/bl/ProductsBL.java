package com.hsbc.ecommerce.bl;

import java.io.IOException;
import java.util.List;

import com.hsbc.ecommerce.models.Products;


public interface ProductsBL {
	boolean addProduct(List<Products>  products) throws  IOException ;
	List<Products>getAllProducts(String category) throws IOException, ClassNotFoundException ;

}
