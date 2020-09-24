/**
 * @Harshal_Kamlesh_Yewale
 * 
 * Interface for Category for adding new items and retrieve data
 */
package com.hsbc.banking.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hsbc.banking.models.Apparel;
import com.hsbc.banking.models.Electronics;
import com.hsbc.banking.models.FoodItems;



public interface CategoryDao {
	//add new apparel items
	boolean addNewApparelItem(List<Apparel> apparel) throws FileNotFoundException, IOException;
	//retrieve apparel items
	List<Apparel> retrieveApparelItems() throws IOException, ClassNotFoundException;
	//add new Electronics items
	boolean addNewElectronicsItem(List<Electronics>electronics) throws IOException;
	//retrieve Electronics items
	List<Electronics> retrieveElectronicsItems() throws IOException, ClassNotFoundException;
	//add new Food items
	boolean addNewFoodItem(List<FoodItems> foodItems) throws IOException;
	//retrieve Food items
	List<FoodItems> retrieveFoodItems() throws FileNotFoundException, IOException, ClassNotFoundException;
	
	
	

}
