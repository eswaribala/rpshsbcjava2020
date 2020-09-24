package com.hsbc.retail.dao;

import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class filehelper {
	private static File file;
	private static ResourceBundle resourceBundle;
public static File createFile() throws IOException
{
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy_hh_mm_ss");
	resourceBundle=resourceBundle.getBundle("com/hsbc/retail/"+"resources/resources");
	file=new File(resourceBundle.getString("filename"));
	
	if(!(file.exists()))
		file.createNewFile();
	
	return file;
} 
}
