package com.hsbc.banking.dao;

import com.hsbc.banking.exception.ProductCostException;
import com.hsbc.banking.models.Product;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductDaoImpl implements ProductDao{

    private File file;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;

    public ProductDaoImpl(String fileName) throws IOException {
        super();
        file = FileHelper.createFile(fileName);
        dataInputStream = new DataInputStream(new FileInputStream(file));
        dataOutputStream = new DataOutputStream(new FileOutputStream(file));
    }

    @Override
    public boolean addProduct(Product product) throws IOException, FileNotFoundException, ProductCostException {
        dataOutputStream.writeLong(product.getProductID());
        dataOutputStream.writeChars(product.getName());
        if(product.getCost() < 0){
            throw new ProductCostException("Product cost should above zero");
        }
        else
            dataOutputStream.writeInt(product.getCost());
        dataOutputStream.writeChars(product.getDop().toString());
        dataOutputStream.writeBoolean(product.isStatus());
        dataOutputStream.close();
        return true;
    }

    @Override
    public Product getProduct() throws IOException {
        Product product = new Product();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        product.setProductID(dataInputStream.readLong());
        char letter = dataInputStream.readChar();
        String name = "";
        while(Character.isLetter(letter)){
            name += letter;
            System.out.println(letter);
            letter = dataInputStream.readChar();
        }
        product.setName(name);
        product.setCost(dataInputStream.readInt());
        char literal = dataInputStream.readChar();
        String dop = "";
        while(Character.isLetter(literal)){
            dop += literal;
            System.out.println(literal);
            literal = dataInputStream.readChar();
        }
        product.setDop(LocalDate.parse(dop, formatter));
        product.setStatus(dataInputStream.readBoolean());
        dataInputStream.close();
        return product;
    }
}
