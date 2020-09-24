package com.hsbc.retail.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


import com.hsbc.retail.models.Apparel;

public interface ApparelDao {

	
	//////interfaces 
	boolean addApparel(List<Apparel> apparellist) throws FileNotFoundException, IOException;
	List<Apparel> getAllApparels() throws FileNotFoundException, IOException, ClassNotFoundException ;
}
