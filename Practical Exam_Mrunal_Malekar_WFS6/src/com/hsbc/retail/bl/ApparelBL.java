package com.hsbc.retail.bl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.hsbc.retail.exceptions.ApparelException;
import com.hsbc.retail.exceptions.ApparelRetreivalException;
import com.hsbc.retail.models.Apparel;

public interface ApparelBL {
	boolean addApparel(List<Apparel> apparellist) throws ApparelException ;
	List<Apparel> getAllApparels() throws ApparelRetreivalException;
	
	
}
