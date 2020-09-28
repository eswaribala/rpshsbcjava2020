package com.hsbc.banking.dao;

import java.sql.SQLException;
import java.util.List;

import com.hsbc.banking.models.Bank;

public interface BankDao {

	//CRUD
	boolean addBanks(List<Bank> bankList) throws SQLException;
	List<Bank> getAllBanks() throws SQLException;
	Bank getBankById(int bankId) throws SQLException;
	boolean deleteBankById(int bankId) throws SQLException;
	boolean updateBank(Bank bank) throws SQLException;
}
