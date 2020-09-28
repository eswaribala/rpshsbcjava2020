package com.hsbc.banking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.hsbc.banking.helpers.DBHelper;
import com.hsbc.banking.models.Bank;

public class BankImpl implements BankDao{

	private Connection conn;
	private PreparedStatement pre;
	private ResultSet resultSet;
	private Statement stmt;
	private boolean status;
	private ResourceBundle resourceBundle;
	
	public BankImpl()
	{
		/*
		 * try { conn= DBHelper.getConnection(); System.out.println("Conn created....");
		 * } catch (SQLException e) { // TODO Auto-generated catch block
		 * System.out.println(e.getErrorCode()); } finally { try { conn.close(); } catch
		 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * }
		 */
		resourceBundle=ResourceBundle.getBundle("com/hsbc/banking/resources/db");
	}
	
	@Override
	public boolean addBanks(List<Bank> bankList) throws SQLException {
		// TODO Auto-generated method stub
		int[] results= {};
		try {
			conn=DBHelper.getConnection();
			pre=conn.prepareStatement(resourceBundle.getString("addBank"));
			for(Bank bank :bankList)
			{
				pre.setInt(1,bank.getBankId());
				pre.setString(2, bank.getBankName());
				pre.setString(3, bank.getCountryName());
				pre.addBatch();
			}
			results=pre.executeBatch();
			conn.commit();
			status=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorCode());
			conn.rollback();
			throw new SQLException("Connection Error Occurred");
		}
		finally
		{
			conn.close();
		}
		
		return status;
	}

	@Override
	public List<Bank> getAllBanks() throws SQLException {
		// TODO Auto-generated method stub
		List<Bank> bankList=new ArrayList<Bank>();
		Bank bank=null;
		try {
			conn=DBHelper.getConnection();
			stmt=conn.createStatement();
			resultSet=stmt.executeQuery(resourceBundle.getString("getBanks"));
			while(resultSet.next())
			{
				bank=new Bank();
				bank.setBankId(resultSet.getInt(1));
				bank.setBankName(resultSet.getString(2));
				bank.setCountryName(resultSet.getString(3));
				bankList.add(bank);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorCode());
			throw new SQLException("Connection Error Occurred");
		}
		finally
		{
			conn.close();
		}
		
		
		return bankList;
	}

	@Override
	public Bank getBankById(int bankId) throws SQLException {
		// TODO Auto-generated method stub
		Bank bank=null;
		try {
			conn=DBHelper.getConnection();
			pre=conn.prepareStatement(resourceBundle.getString("getBankById"));
			pre.setInt(1,bankId);
			resultSet=pre.executeQuery();
			resultSet.next();
			bank=new Bank();
			bank.setBankId(resultSet.getInt(1));
			bank.setBankName(resultSet.getString(2));
			bank.setCountryName(resultSet.getString(3));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorCode());
			
			throw new SQLException("Connection Error Occurred");
		}
		finally
		{
			conn.close();
		}
		
		return bank;
	}

	@Override
	public boolean deleteBankById(int bankId) throws SQLException {
		// TODO Auto-generated method stub
		       int result=0;
				try {
					conn=DBHelper.getConnection();
					pre=conn.prepareStatement(resourceBundle.getString("deleteBankById"));
					pre.setInt(1,bankId);
					result=pre.executeUpdate();
					conn.commit();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getErrorCode());
					conn.rollback();
					throw new SQLException("Connection Error Occurred");
				}
				finally
				{
					conn.close();
				}
				
				if(result>0)
					status=true;
				return status;
	}

	@Override
	public boolean updateBank(Bank bank) throws SQLException {
		// TODO Auto-generated method stub
		int result=0;
		try {
			conn=DBHelper.getConnection();
			pre=conn.prepareStatement(resourceBundle.getString("updateBank"));
			
			  pre.setInt(3,bank.getBankId()); 
			  pre.setString(1,bank.getBankName());
			  pre.setString(2, bank.getCountryName()); 
			  result=pre.executeUpdate();
			  System.out.println(result);
			  conn.commit();
			   
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getErrorCode());
			//conn.rollback();
			throw new SQLException("Connection Error Occurred");
		}
		finally
		{
			conn.close();
		}
		
		if(result>0)
			status=true;
		return status;
	}

}
