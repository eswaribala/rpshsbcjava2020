package com.hsbc.ecommerce.dao;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileHelper {
	
	private static File file;
	public static File createFile(String fileName,int level) throws IOException
	{
		
		DateTimeFormatter formatter=DateTimeFormatter
	             .ofPattern("dd-MM-yyyy_hh_mm_ss");	

		//create file
		//file=new File(fileName+"_"+LocalDateTime.now().format(formatter)+".txt");
		if(level==1)
		{
		
		file=new File(fileName);
		if(!file.exists())
			file.createNewFile();
		else
			file.delete();
		}
		else
		{
			file=new File("Sub"+fileName);
			if(!file.exists())
				file.createNewFile();
			else
				file.delete();
		}
		
        return file; 	
		
		
	}

}
