package com.hsbc.retail.bl;

import java.io.IOException;
import java.util.List;


import com.hsbc.retail.dao.ApparelDao;
import com.hsbc.retail.dao.ApparelDaoImpl;
import com.hsbc.retail.exceptions.ApparelException;
import com.hsbc.retail.exceptions.ApparelRetreivalException;
import com.hsbc.retail.exceptions.FileCreationException;
import com.hsbc.retail.models.Apparel;

public class ApparelBLImpl implements ApparelBL {
	
	
private ApparelDao d1;
	
	public ApparelBLImpl() throws FileCreationException
	{
		
		try {
			d1=new ApparelDaoImpl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			///re throw 
			new FileCreationException("file not being created--file creation exception");
		}
	}

	@Override
	public boolean addApparel(List<Apparel> apparellist) throws ApparelException {
		// TODO Auto-generated method stub
		////add apparels
		
boolean status=false;
		
		try {
			status=d1.addApparel(apparellist);
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			new ApparelException("not able to store objects");
			
		}
		return status;
	}

	@Override
	public List<Apparel> getAllApparels() throws ApparelRetreivalException{
		// TODO Auto-generated method stub
List<Apparel> apparellist=null;
		
		////////get apparels
		try {
			apparellist= d1.getAllApparels();
		} catch (  IOException|ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new ApparelRetreivalException("vehicles cant be retreived");
		} 
		return apparellist;
	}

	
	
}
