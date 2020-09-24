package com.hsbc.ecommerce.bl;

import com.hsbc.ecommerce.models.Apparels;
import com.hsbc.ecommerce.models.Electronics;
import com.hsbc.ecommerce.models.FoodItems;
import com.hsbc.ecommerce.models.Product;

import java.io.IOException;
import java.util.List;

public interface ProductsBL {
	boolean addFoodItems(List<Product> foodItemsList) throws IOException;
	boolean addApparels(List<Product> apparelsList) throws IOException;
	boolean addElectronics(List<Product> electronicsList) throws IOException;

	Product getAllProducts(String itemType);
}
