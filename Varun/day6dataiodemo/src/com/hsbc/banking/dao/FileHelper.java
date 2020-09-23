package com.hsbc.banking.dao;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileHelper {
	
	private static File file;
	public static File createFile(String fileName) throws IOException
	{
		
		DateTimeFormatter formatter=DateTimeFormatter
	             .ofPattern("dd-MM-yyyy_hh_mm_ss");	

		//create file
		file=new File(fileName + "_" + LocalDateTime.now().format(formatter)+".txt");
		if(!file.exists())
			file.createNewFile();
		
		
        return file; 	
		
		
	}

}
