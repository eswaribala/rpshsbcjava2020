package com.hsbc.banking.dao;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileHelper {
	
	private static File file;
	public static File createFile(String dirPath, String fileName) throws IOException
	{
		file=new File(dirPath);
		//create directory
		if(!file.exists())
			file.mkdir();
		
		DateTimeFormatter formatter=DateTimeFormatter
	             .ofPattern("dd-MM-yyyy_hh_mm_ss");	

		//create file
		file=new File(dirPath,LocalDateTime.now().format(formatter)+".csv");
		if(!file.exists())
			file.createNewFile();
		
		
        return file; 	
		
		
	}

}
