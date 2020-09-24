package com.hsbc.products.dao;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class FileHelper {
	
	private static File file;
	private static ResourceBundle resourceBundle;
	public static File createFile() throws IOException
	{
		resourceBundle=ResourceBundle.getBundle("com/hsbc/products/resources/sources");	
		
		file=new File(resourceBundle.getString("fileName"));
		if(!file.exists())
			file.createNewFile();
		
		
        return file; 	
		
		
	}

}
