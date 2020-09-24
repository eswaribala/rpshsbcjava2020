package com.hsbc.ecommerce.dao;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileHelper {
	
	private static File file;
	public static File createFile(String fileName) throws IOException
	{
		
	
		file=new File(fileName);
		if(!file.exists())
			file.createNewFile();
		
		
        return file; 	
		
		
	}

}
