/**
 * @author: Varun Rajendra Gujarathi
 * @purpose: Java file containing the DAO Interface
 * @created_on: 24/09/2020
 */
package com.hsbc.ecommerce.dao;

import com.hsbc.ecommerce.models.Apparels;
import com.hsbc.ecommerce.models.Electronics;
import com.hsbc.ecommerce.models.FoodItems;
import com.hsbc.ecommerce.models.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ProductsDao {
	boolean addFoodItems(List<Product> foodItemsList) throws FileNotFoundException, IOException;
	boolean addApparels(List<Product> apparelsList) throws FileNotFoundException, IOException;
	boolean addElectronics(List<Product> electronicsList) throws FileNotFoundException, IOException;

	Product getAllProducts(String itemType);
}
