package com.hsbc.banking.bl;

import java.sql.SQLException;
import java.util.List;

import com.hsbc.banking.exceptions.DBConnCreationException;
import com.hsbc.banking.exceptions.DBQueryExecutionException;
import com.hsbc.banking.models.Bank;

public interface BankBL {

	//CRUD
		boolean addBanks(List<Bank> bankList) throws DBConnCreationException, SQLException;
		List<Bank> getAllBanks() throws DBConnCreationException;
		Bank getBankById(int bankId) throws DBConnCreationException;
		boolean deleteBankById(int bankId) throws DBConnCreationException;
		boolean updateBank(Bank bank) throws DBConnCreationException;
	}