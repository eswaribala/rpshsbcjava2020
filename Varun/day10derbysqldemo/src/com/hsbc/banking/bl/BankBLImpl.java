package com.hsbc.banking.bl;

import java.sql.SQLException;
import java.util.List;

import com.hsbc.banking.dao.BankDao;
import com.hsbc.banking.dao.BankImpl;
import com.hsbc.banking.exceptions.DBConnCreationException;
import com.hsbc.banking.exceptions.DBQueryExecutionException;
import com.hsbc.banking.models.Bank;

public class BankBLImpl implements BankBL {

	private BankDao bankDao;
	
	public BankBLImpl()
	{
		bankDao=new BankImpl();
	}
	@Override
	public boolean addBanks(List<Bank> bankList) throws DBConnCreationException, SQLException {
		// TODO Auto-generated method stub
		boolean status=false;

		status= bankDao.addBanks(bankList);

		
		return status;
	}

	@Override
	public List<Bank> getAllBanks() throws DBConnCreationException {
		// TODO Auto-generated method stub
		List<Bank> bankList=null;
		try {
			bankList=bankDao.getAllBanks();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DBConnCreationException("DB Conn Error");
		}
		return bankList;
	}

	@Override
	public Bank getBankById(int bankId) throws DBConnCreationException {
		// TODO Auto-generated method stub
		Bank bank=null;
		 try {
			bank=bankDao.getBankById(bankId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DBConnCreationException("DB Conn Error");
		}
	  return bank;
	}
	

	@Override
	public boolean deleteBankById(int bankId) throws DBConnCreationException {
		// TODO Auto-generated method stub
		boolean status=false;
		 try {
			status=bankDao.deleteBankById(bankId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DBConnCreationException("DB Conn Error");
		}
	  return status;
	}

	@Override
	public boolean updateBank(Bank bank) throws DBConnCreationException {
		// TODO Auto-generated method stub
		boolean status=false;
		 try {
			status=bankDao.updateBank(bank);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DBConnCreationException("DB Conn Error");
		}
	  return status;
	}

}
