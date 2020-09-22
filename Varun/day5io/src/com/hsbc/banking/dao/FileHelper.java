package com.hsbc.banking.dao;

import java.io.File;
import java.io.IOException;

public class FileHelper {
	
	private static File file;
	public static File createFile(String dirPath, String fileName) throws IOException
	{
		file=new File(dirPath);
		//create directory
		if(!file.exists())
			file.mkdir();
		
		//create file
		file=new File(dirPath,fileName);
		if(!file.exists())
			file.createNewFile();
		
		
        return file; 	
		
		
	}

}
