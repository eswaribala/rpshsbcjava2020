package com.hsbc.banking.dao;

import java.io.*;

public class FileCopyImpl implements FileCopyDao{

    private File readFile, writeFile;
    private FileInputStream fileInputStream;
    private FileOutputStream fileOutputStream;
    private byte[] fileContent;


    public FileCopyImpl(String readFileName, String writeFileName){
        readFile = new File(readFileName);
        writeFile = new File(writeFileName);
        try {
            fileInputStream = new FileInputStream(readFile);
            fileOutputStream = new FileOutputStream(writeFile);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean copyFileContent() throws IOException {
        fileContent = new byte[(int) readFile.length()];
        fileInputStream.read(fileContent);
        String data = new String(fileContent);
        fileOutputStream.write(fileContent);
//        System.out.println(data);
        fileOutputStream.close();
        fileInputStream.close();
        return true;
    }
}
