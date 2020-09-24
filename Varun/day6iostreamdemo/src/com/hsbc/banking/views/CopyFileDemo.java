package com.hsbc.banking.views;

import com.hsbc.banking.bl.FileCopyBLImpl;
import com.hsbc.banking.bl.FileCopyBl;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyFileDemo {
    private static FileCopyBl fileCopyBl;
    static {
        try {
            fileCopyBl = new FileCopyBLImpl("Employee.txt","EmployeeClone.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            System.out.print("File copy status: ");
            System.out.println(fileCopyBl.copyFileContent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
