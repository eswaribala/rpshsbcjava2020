package com.hsbc.banking.Bl;

import com.hsbc.banking.dao.WorkerDao;
import com.hsbc.banking.dao.WorkerDaoImpl;
import com.hsbc.banking.models.DailyWorker;
import com.hsbc.banking.models.SalariedWorker;

public class WorkerBlImpl implements WorkerBl
{
	WorkerDao workerDao=new WorkerDaoImpl();

	@Override
	public void addDailyWorker(DailyWorker dw) 
	{
		workerDao.addDailyWorker(dw);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSalariedWorker(SalariedWorker sw)
	{
		workerDao.addSalariedWorker(sw);
		// TODO Auto-generated method stub
		
	}
	

	
	@Override
	public void pay() 
	{
		workerDao.pay();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay1() 
	{
		workerDao.pay1();
		// TODO Auto-generated method stub
		
	}

	
}
