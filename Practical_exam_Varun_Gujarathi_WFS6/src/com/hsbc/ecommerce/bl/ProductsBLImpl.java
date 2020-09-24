package com.hsbc.ecommerce.bl;

import com.hsbc.ecommerce.dao.ProductsDao;
import com.hsbc.ecommerce.dao.ProductsImpl;
import com.hsbc.ecommerce.exceptions.FileCreationException;
import com.hsbc.ecommerce.models.Electronics;
import com.hsbc.ecommerce.models.Product;

import java.io.IOException;
import java.util.List;

public class ProductsBLImpl implements ProductsBL {
	private ProductsDao productsDao;

	public ProductsBLImpl(ProductsDao productsDao) throws FileCreationException {
		try {
			productsDao = new ProductsImpl();
		} catch (IOException e) {
			//rethrow
			throw new FileCreationException("Not able to create the "
													+ "file, change the location, Check Permission");
		}
	}

	@Override
	public boolean addFoodItems(List<Product> foodItemsList) throws IOException {
		return productsDao.addFoodItems(foodItemsList);
	}

	@Override
	public boolean addApparels(List<Product> apparelsList) throws IOException {
		return productsDao.addApparels(apparelsList);
	}

	@Override
	public boolean addElectronics(List<Product> electronicsList) throws IOException {
		return productsDao.addElectronics(electronicsList);
	}

	@Override
	public Product getAllProducts(String itemType) {
		List<Product> productList = null;
		return productsDao.getAllProducts(itemType);
	}
}
