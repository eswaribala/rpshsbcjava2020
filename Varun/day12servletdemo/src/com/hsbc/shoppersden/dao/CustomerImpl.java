package com.hsbc.shoppersden.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.ResourceBundle;
import com.hsbc.shoppersden.helpers.DBHelper;
import com.hsbc.shoppersden.models.ShopperDenCustomer;
import com.hsbcshoppersden.exceptions.DBConnCreationException;


public class CustomerImpl implements CustomerDao{

	private Connection conn;
	private PreparedStatement pre;
	private ResultSet resultSet;
	private Statement stmt;
	private boolean status;
	private ResourceBundle resourceBundle;
	private static int customerId;
	
	public CustomerImpl()
	{
			
		resourceBundle=ResourceBundle.getBundle("com/hsbc/shoppersden/resources/db");
	}
	
	

	@Override
	public boolean addCustomer(ShopperDenCustomer customer) throws DBConnCreationException {
		// TODO Auto-generated method stub
		try
		{
		conn=DBHelper.getConnection();
		pre=conn.prepareStatement(resourceBundle.getString("addCustomer"));
		customerId=new Random().nextInt(10000)+1;	
			pre.setInt(1,customerId);
			pre.setString(2, customer.getFirstName());
			pre.setString(3, customer.getLastName());
			pre.setDate(4, Date.valueOf(customer.getDob()));	
			pre.setString(5, customer.getCountryName());
			pre.executeUpdate();
			conn.commit();
			status=true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Error Code"+e.getErrorCode());
		System.out.println(e.getMessage());
		try {
			conn.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		throw new DBConnCreationException("Connection Error Occurred");
	}
	finally
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	return status;
	}

	

}
