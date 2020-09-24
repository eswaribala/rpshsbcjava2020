package com.hsbc.banking.dao;

import com.hsbc.banking.models.DailyWorker;
import com.hsbc.banking.models.SalariedWorker;

public class WorkerDaoImpl implements WorkerDao
{
	
	SalariedWorker[] salariedWorkerArray=new SalariedWorker[5];
	DailyWorker[] dailyWorkerArray=new DailyWorker[5];
	
	int p=0;
	int q=0;
	
	@Override
	public void pay() 
	{
		for(int i=0; i<salariedWorkerArray.length; i++) 
		{
			float a=salariedWorkerArray[i].getNoOfWorkingHours()*salariedWorkerArray[i].getSalaryRate();
			salariedWorkerArray[i].setOutput(a);
			System.out.println(salariedWorkerArray[i]);
			
		}
		
		
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public void addDailyWorker(DailyWorker dw)
	{
		dailyWorkerArray[p]=dw;
		p++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSalariedWorker(SalariedWorker sw) 
	{
		// TODO Auto-generated method stub
		salariedWorkerArray[q]=sw;
	}



	@Override
	public void pay1()
	{
		for(int i=0; i<dailyWorkerArray.length; i++) 
		{
			float a=dailyWorkerArray[i].getNoOfWorkingHours()*dailyWorkerArray[i].getSalaryRate();
			dailyWorkerArray[i].setOutput(a);
			System.out.println(dailyWorkerArray[i]);
			
		}
		// TODO Auto-generated method stub
		
	}

}
