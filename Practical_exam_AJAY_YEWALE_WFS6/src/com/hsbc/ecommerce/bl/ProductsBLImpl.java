package com.hsbc.ecommerce.bl;

import java.io.IOException;
import java.util.List;

import com.hsbc.ecommerce.dao.ProductsDao;
import com.hsbc.ecommerce.dao.ProductsDaoImpl;
import com.hsbc.ecommerce.models.Products;

public class ProductsBLImpl implements ProductsBL {
	private ProductsDao productsDao;
	
	public ProductsBLImpl(String fileName) throws IOException {
		// TODO Auto-generated constructor stub
		productsDao=new ProductsDaoImpl(fileName);
	}

	@Override
	public boolean addProduct(List<Products>  products) throws IOException {
		// TODO Auto-generated method stub
		productsDao.addProduct(products);
		return true;
	}

	@Override
	public List<Products> getAllProducts(String category) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return productsDao.getAllProducts(category);
		
	}

}
