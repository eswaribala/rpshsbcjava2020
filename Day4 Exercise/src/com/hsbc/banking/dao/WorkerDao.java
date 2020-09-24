package com.hsbc.banking.dao;

import com.hsbc.banking.models.DailyWorker;
import com.hsbc.banking.models.SalariedWorker;

public interface WorkerDao
{
	    public void addDailyWorker(DailyWorker dw);
	    public void addSalariedWorker(SalariedWorker dw);
		public void pay ();
		public void pay1 ();
		
		
	


}
